package task6;

import java.util.ArrayList;
import java.util.List;

/*
Задача №17
Выведите все числа в списке, которые не кратны 2.
 */
public class Objective17 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(2);
        arrayList.add(-5);
        arrayList.add(23);
        arrayList.add(52);
        arrayList.add(-45);
        arrayList.add(17);

        List<Integer> arrayList1 = arrayList.stream()
                .filter(a -> a % 2 == 0)
                .toList();
        arrayList1.forEach(System.out::println);
    }

}
