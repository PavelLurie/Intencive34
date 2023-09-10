import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.aston.lurie_pa.task4.dao.OrdersImplDAO;
import ru.aston.lurie_pa.task4.dao.UsersImplDAO;
import ru.aston.lurie_pa.task4.entity.Order;
import ru.aston.lurie_pa.task4.entity.User;

import java.util.Optional;

public class ImplDAOTest {

    @Test
    void OrdersDAOImlTest(){
        OrdersImplDAO ordersImplDAO = new OrdersImplDAO();

        Assertions.assertAll(
                () -> Assertions.assertTrue(ordersImplDAO.createOrdersTable()),
                () -> Assertions.assertInstanceOf(Order.class, ordersImplDAO.addOrders("Яблоко", "16.07.2023", "Пешкарики")),
                () -> Assertions.assertInstanceOf(Optional.class, ordersImplDAO.findOrdersById(1)),
                () -> Assertions.assertNotNull(ordersImplDAO.findAll()),
                () -> Assertions.assertInstanceOf(Order.class, ordersImplDAO.update(1, "Pony Express"))

        );
    }

    @Test
    void UsersDAOImlTest(){
        UsersImplDAO userImplDAO = new UsersImplDAO();

        Assertions.assertAll(
                () -> Assertions.assertTrue(userImplDAO.createUsersTable()),
                () -> Assertions.assertInstanceOf(User.class, userImplDAO.addUser("Смирнов Сергей Петрович", "+7-931-256-59-98", "smirnov92@yandex.ru", 1)),
                () -> Assertions.assertInstanceOf(Optional.class, userImplDAO.findUserById(1)),
                () -> Assertions.assertNotNull(userImplDAO.findAll()),
                () -> Assertions.assertInstanceOf(User.class, userImplDAO.update(1, "+79116982317")),
                () -> Assertions.assertNotNull(userImplDAO.findUserOrders()),
                () -> Assertions.assertTrue(userImplDAO.delete(1))
        );
    }

    @Test
    void deleteOrderTest(){
        OrdersImplDAO ordersImplDAO = new OrdersImplDAO();

        Assertions.assertTrue(ordersImplDAO.delete(1));
    }
}
