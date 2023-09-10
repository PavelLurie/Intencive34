package ru.aston.lurie_pa.task4.dao;

import ru.aston.lurie_pa.task4.entity.Order;
import ru.aston.lurie_pa.task4.entity.User;

import java.util.List;
import java.util.Optional;

public interface OrdersDAO {
    boolean createOrdersTable();
    Order addOrders(String productName, String dateOrder, String shipperName);
    Optional<Order> findOrdersById(long id);
    List<Order> findAll();
    boolean delete(long id);
    Order update (long id, String shipperName);
}
