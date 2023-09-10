package ru.aston.lurie_pa.task4.dao;

import ru.aston.lurie_pa.task4.connection.Singleton;
import ru.aston.lurie_pa.task4.entity.Order;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class OrdersImplDAO implements OrdersDAO{
    private final Connection connection = Singleton.getInstance().getConnection();
    ReadScript readScript = new ReadScript();

    @Override
    public boolean createOrdersTable() {
        String getScript = readScript.getPathScript("src/main/resources/sql/createOrdersTable.sql");

        try (Statement statement = connection.createStatement()){
            statement.executeUpdate(getScript);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    @Override
    public Order addOrders(String productName, String dateOrder, String shipperName) {
        long id = 0;
        Order order = new Order(id, productName, dateOrder, shipperName);
        String getScript = readScript.getPathScript("src/main/resources/sql/insertIntoOrder.sql");

        try (PreparedStatement ps = connection.prepareStatement(getScript)) {
            ps.setString(1, productName);
            ps.setString(2, dateOrder);
            ps.setString(3, shipperName);

            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return order;
    }

    @Override
    public Optional<Order> findOrdersById(long id) {
            Order order = null;
        String sqlRequest = "SELECT * FROM orders WHERE id = ?";
        try (PreparedStatement ps = connection.prepareStatement(sqlRequest)){
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                order = new Order();
                order.setId(rs.getLong("id"));
                order.setProductName(rs.getString("product_name"));
                order.setDataOrder(rs.getString("data_order"));
                order.setShipperName(rs.getString("shipper_name"));

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return Optional.ofNullable(order);
    }

    @Override
    public List<Order> findAll() {
        List<Order> allOrders = new ArrayList<>();
        String sqlRequest = "SELECT * FROM orders";

        try (PreparedStatement ps = connection.prepareStatement(sqlRequest)){
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                allOrders.add(new Order(rs.getLong("id"), rs.getString("product_name"), rs.getString("data_order"), rs.getString("shipper_name")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return allOrders;
    }

    @Override
    public boolean delete(long id) {
        String sqlRequest = "DELETE FROM orders WHERE id=?";

        try (PreparedStatement ps = connection.prepareStatement(sqlRequest)){
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    @Override
    public Order update(long id, String shipperName) {
        Order order = new Order();
        String sqlRequest = "UPDATE orders SET shipper_name = ? WHERE id = ?";
        try (PreparedStatement ps = connection.prepareStatement(sqlRequest)){
            ps.setString(1, shipperName);
            ps.setLong(2, id);
            ps.executeUpdate();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return order;
    }
}
