package task6;

import java.util.stream.Stream;

/*
Задача №34
Создайте Stream чисел от 2 до 10.
Умножьте их на 2 и выведите результат на экран, ограничьтесь первыми десятью результатами.
 */
public class Objective34 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(2, s -> s + 1)
                .limit(9);

        stream.map(s -> s * 2)
                .limit(10)
                .forEach(System.out::println);
    }
}
