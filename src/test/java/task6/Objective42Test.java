package task6;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

/*
Задача №42
Создать стрим четных чисел от 2 до 40 и вывести на экран количество элементов в этом стриме.
 */
public class Objective42Test {
    @Test
    void ObjectiveTest() {
        Stream<Integer> stream = Stream.iterate(2, s -> s + 2)
                .limit(20);

        long count = stream.count();
        System.out.println(count);

    }

}
