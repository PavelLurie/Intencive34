import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import ru.aston.lurie_pa.task4.dao.OrdersImplDAO;
import ru.aston.lurie_pa.task4.dao.UsersImplDAO;
import ru.aston.lurie_pa.task4.entity.Order;
import ru.aston.lurie_pa.task4.entity.User;

import java.util.List;
import java.util.Optional;


public class ImplDAOMockTest {

    @Test
    void ordersDAOImlMockitoTest(){
        OrdersImplDAO ordersImplDAO = Mockito.mock(OrdersImplDAO.class);
        Mockito.when(ordersImplDAO.createOrdersTable()).thenReturn(true);
        Mockito.when(ordersImplDAO.addOrders("Апельсин", "25.07.2023","DHL")).thenReturn(new Order());
        Mockito.when(ordersImplDAO.findOrdersById(1)).thenReturn(Optional.of(new Order(1, "Мандарин", "05.08.2023","Pony Express")));
        Mockito.when(ordersImplDAO.findAll()).thenReturn(List.of(new Order(2, "Ананас", "06.05.2023","Pony Express")));
        Mockito.when(ordersImplDAO.update(1,"Pony Express")).thenReturn(new Order());
        Mockito.when(ordersImplDAO.delete(1)).thenReturn(true);

        Assertions.assertAll(
                () -> Assertions.assertTrue(ordersImplDAO.createOrdersTable()),
                () -> Assertions.assertInstanceOf(Order.class, ordersImplDAO.addOrders("Апельсин", "25.07.2023","DHL")),
                () -> Assertions.assertInstanceOf(Optional.class, ordersImplDAO.findOrdersById(1)),
                () -> Assertions.assertNotNull(ordersImplDAO.findAll()),
                () -> Assertions.assertInstanceOf(Order.class, ordersImplDAO.update(1, "Pony Express")),
                () -> Assertions.assertTrue(ordersImplDAO.delete(1))
        );
    }

    @Test
    void usersDAOImlMockitoTest(){
        UsersImplDAO usersImplDAO = Mockito.mock(UsersImplDAO.class);
        Mockito.when(usersImplDAO.createUsersTable()).thenReturn(true);
        Mockito.when(usersImplDAO.addUser("Смирнов Сергей Петрович", "+7-931-256-59-98", "smirnov92@yandex.ru", 1)).thenReturn(new User());
        Mockito.when(usersImplDAO.findUserById(1)).thenReturn(Optional.of(new User(1,"Смирнов Сергей Петрович", "+7-931-256-59-98", "smirnov92@yandex.ru", 1)));
        Mockito.when(usersImplDAO.findAll()).thenReturn(List.of(new User(1,"Смирнов Сергей Петрович", "+7-931-256-59-98", "smirnov92@yandex.ru", 1)));
        Mockito.when(usersImplDAO.update(1,"+7-911-923-45-54")).thenReturn(new User());
        Mockito.when(usersImplDAO.delete(1)).thenReturn(true);

        Assertions.assertAll(
                () -> Assertions.assertTrue(usersImplDAO.createUsersTable()),
                () -> Assertions.assertInstanceOf(User.class, usersImplDAO.addUser("Смирнов Сергей Петрович", "+7-931-256-59-98", "smirnov92@yandex.ru", 1)),
                () -> Assertions.assertInstanceOf(Optional.class, usersImplDAO.findUserById(1)),
                () -> Assertions.assertNotNull(usersImplDAO.findAll()),
                () -> Assertions.assertInstanceOf(User.class, usersImplDAO.update(1, "+7-911-923-45-54")),
                () -> Assertions.assertTrue(usersImplDAO.delete(1))
        );
    }

}
