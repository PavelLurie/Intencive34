package task6;

import java.util.ArrayList;
import java.util.List;

/*
Задача №15
Отфильтруйте все элементы списка, которые меньше 0.
 */
public class Objective15 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(2);
        arrayList.add(-5);
        arrayList.add(23);
        arrayList.add(52);
        arrayList.add(-45);
        arrayList.add(17);

        List<Integer> arrayList1 = arrayList.stream()
                .filter(a -> a < 0)
                .toList();

        arrayList1.forEach(System.out::println);
    }
}
