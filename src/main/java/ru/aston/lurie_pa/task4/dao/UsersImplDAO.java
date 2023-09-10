package ru.aston.lurie_pa.task4.dao;

import ru.aston.lurie_pa.task4.connection.Singleton;
import ru.aston.lurie_pa.task4.entity.User;
import ru.aston.lurie_pa.task4.entity.UserOrders;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UsersImplDAO implements UsersDAO {

    private final Connection connection = Singleton.getInstance().getConnection();
    ReadScript readScript = new ReadScript();

    @Override
    public boolean createUsersTable() {
        String getScript = readScript.getPathScript("src/main/resources/sql/createUsersTable.sql");

        try (Statement statement = connection.createStatement()){
            statement.executeUpdate(getScript);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    @Override
    public User addUser(String fio, String phone, String email, long orderId) {
        long id = 0;
        User user = new User(id, fio, phone, email, orderId);
        String getScript = readScript.getPathScript("src/main/resources/sql/insertIntoUsers.sql");

        try (PreparedStatement ps = connection.prepareStatement(getScript)) {
            ps.setString(1, fio);
            ps.setString(2, phone);
            ps.setString(3, email);
            ps.setLong(4, orderId);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }

    @Override
    public Optional<User> findUserById(long id) {
        User user = null;
        String sqlRequest = "SELECT * FROM users WHERE id = ?";
        try (PreparedStatement ps = connection.prepareStatement(sqlRequest)){
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                user = new User();
                user.setId(rs.getLong("id"));
                user.setFio(rs.getString("fio"));
                user.setPhone(rs.getString("phone"));
                user.setEmail(rs.getString("email"));
                user.setOrderId(rs.getLong("order_id"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return Optional.ofNullable(user);
    }

    @Override
    public List<User> findAll() {
        List<User> allUsers = new ArrayList<>();
        String sqlRequest = "SELECT * FROM users";

        try (PreparedStatement ps = connection.prepareStatement(sqlRequest)){
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                allUsers.add(new User(rs.getLong("id"), rs.getString("fio"), rs.getString("phone"), rs.getString("email"), rs.getInt("order_id")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return allUsers;

    }

    @Override
    public boolean delete(long id) {
        String sqlRequest = "DELETE FROM users WHERE id=?";

        try (PreparedStatement ps = connection.prepareStatement(sqlRequest)){
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    @Override
    public User update(long id, String phone) {
        User user = new User();
        String sqlRequest = "UPDATE users SET phone = ? WHERE id = ?";
        try (PreparedStatement ps = connection.prepareStatement(sqlRequest)){
            ps.setString(1, phone);
            ps.setLong(2, id);
            ps.executeUpdate();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }

    @Override
    public List<UserOrders> findUserOrders() {
        List<UserOrders> usersOrders = new ArrayList<>();
        String sqlRequest = "SELECT users.id, users.fio, orders.product_name, orders.data_order, orders.shipper_name\n" +
                "FROM users INNER JOIN orders ON users.order_id=orders.id";
        try (PreparedStatement ps = connection.prepareStatement(sqlRequest)){
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                usersOrders.add(new UserOrders(rs.getLong("id"), rs.getString("fio"), rs.getString("product_name"), rs.getString("data_order"), rs.getString("shipper_name")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return usersOrders;
    }
}
