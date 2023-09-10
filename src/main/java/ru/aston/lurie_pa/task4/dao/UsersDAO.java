package ru.aston.lurie_pa.task4.dao;

import ru.aston.lurie_pa.task4.entity.User;
import ru.aston.lurie_pa.task4.entity.UserOrders;

import java.util.List;
import java.util.Optional;

public interface UsersDAO {
    boolean createUsersTable();
    User addUser(String fio, String phone, String email, long orderId);
    Optional<User> findUserById(long id);
    List<User> findAll();
    boolean delete(long id);
    User update (long id, String phone);
    List<UserOrders> findUserOrders();

}
