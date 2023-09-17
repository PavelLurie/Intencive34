package task6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Задача №43
Разделить элементы Stream на две группы: четные и нечетные, вывести результаты.
 */
public class Objective43 {
    public static void main(String[] args) {
        Stream.iterate(1, s -> s + 1)
                .limit(10)
                .collect(Collectors.partitioningBy(n -> n % 2 == 0))
                .values()
                .forEach(System.out::println);
    }
}
