package task6;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

/*
Задача №32
Создайте два Stream-а: один из массива чисел 1…5, второй из массива 5…10.
Объедините эти два Stream-а в один и выведите на экран.
 */

    @Test
    void ObjectiveTest() {
        Stream<Integer> stream1 = Stream.iterate(1, s -> s + 1)
                .limit(5);
        Stream<Integer> stream2 = Stream.iterate(6, s -> s + 1)
                .limit(5);

        Stream.concat(stream1, stream2)
                .forEach(System.out::println);
    }
}
