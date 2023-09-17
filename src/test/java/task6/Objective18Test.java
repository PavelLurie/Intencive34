package task6;
/*
Задача №18
Отфильтруйте объекты по определенному свойству,
например, выведите все записи из базы данных, у которых значение поля равно 1.
 */

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Objective18Test {

   @Test
    void ObjectiveTest() {
        String generalCity = "Moscow";
        List<User> users = new ArrayList<>();

        User user = new User(1, "Mike", "NY");
        User user1 = new User(2, "Иван", "Moscow");
        User user2 = new User(3, "Nick", "Washington");
        User user3 = new User(4, "Сергей", "Moscow");
        User user4 = new User(5, "Matt", "SPB");
        User user5 = new User(6, "Роман", "Moscow");
        User user6 = new User(7, "Kate", "LA");

        users.add(user);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);

        List<User> users1 = users.stream()
                .filter(u -> u.city.equals(generalCity))
                .toList();

        users1.forEach(System.out::println);

    }
}
 class User{
    int id;
    String name;
    String city;

    public User(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}