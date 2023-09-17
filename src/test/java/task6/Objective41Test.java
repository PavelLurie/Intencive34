package task6;
/*
Задача №41
Создать три стрима из массивов чисел от 1 до 10, от 10 до 20 и от 20 до 30 соответственно.
Объединить их в один стрим и вывести числа, которые кратны 5.
 */

import org.junit.jupiter.api.Test;

import java.util.function.Function;
import java.util.stream.Stream;

public class Objective41Test {
    @Test
    void ObjectiveTest() {
        Stream<Integer> stream = Stream.iterate(1, s -> s + 1)
                .limit(10);
        Stream<Integer> stream1 = Stream.iterate(11, s -> s + 1)
                .limit(10);
        Stream<Integer> stream2 = Stream.iterate(21, s -> s +1)
                .limit(10);

        Stream.of(stream, stream1, stream2)
                .flatMap(Function.identity())
                .filter(s -> s % 5 == 0)
                .forEach(System.out::println);
    }
}
