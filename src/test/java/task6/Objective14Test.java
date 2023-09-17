package task6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/*
  Задача №14
  Выведите на экран только те элементы списка, которые больше заданного числа.
   */
public class Objective14Test {

    @Test
    void ObjectiveTest() {
        int givenNumber = 10;
        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(2);
        arrayList.add(-5);
        arrayList.add(23);
        arrayList.add(52);
        arrayList.add(-45);
        arrayList.add(17);

        List<Integer> arrayList1 = arrayList.stream()
                .filter(a -> a > givenNumber)
                .toList();

        arrayList1.forEach(System.out::println);
    }
}
