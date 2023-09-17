package task6;
/*
Задача №16
Выведите на экран строки, которые начинаются с заданной подстроки.
 */

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Objective16Test {

    @Test
    void ObjectiveTest(){
        String givenSubstring = "электр";

        List<String> stringList = new ArrayList<>();

        stringList.add("автоэлектрик");
        stringList.add("электричество");
        stringList.add("электрик");
        stringList.add("электрификация");
        stringList.add("машина");
        stringList.add("электроинструмент");
        stringList.add("электростанция");
        stringList.add("микроэлектроника");
        stringList.add("электроника");
        stringList.add("электроплита");

        List<String> stringList1 = stringList.stream()
                .filter(s -> s.startsWith(givenSubstring))
                .toList();

        stringList1.forEach(System.out::println);
    }
}
