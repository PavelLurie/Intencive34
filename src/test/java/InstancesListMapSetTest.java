import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class InstancesListMapSetTest {

    List<Integer> testList = new ArrayList<>(20);
    List<Integer> arrayList = new ArrayList<>(testList);

    Map<String, Integer> hashMap = new HashMap<>(64);
    Map<String, Integer> hashMap1 = new HashMap<>(hashMap);
    Map<String, Integer> hashMap2 = new HashMap<>(64, 0.5f);

    Set<Integer> treeSet = new TreeSet<>();
    Set<Integer> treeSet1 = new TreeSet<>(treeSet);
    Set<Integer> treeSet2 = new TreeSet<>(arrayList);
    Set<Integer> treeSet3 = new TreeSet<>(hashMap1.values());

    Comparator<String> comp = String::compareTo;
    Set<String> treeSet4 = new TreeSet<>(comp);

    SortedSet<Integer> sortedSet = new TreeSet<>();
    Set<Integer> getTreeSet5 = new TreeSet<>(sortedSet);

    @Test
    void methodListTest(){
        testList.add(5);
        testList.add(2);
        testList.add(3);
        Integer element = testList.get(0);
        int sizeList = testList.size();
        boolean empty = testList.isEmpty();

        Assertions.assertAll(
                () -> Assertions.assertNotNull(testList),
                () -> Assertions.assertEquals(5, element),
                () -> Assertions.assertEquals(3, sizeList),
                () -> Assertions.assertFalse(empty)
        );
    }

    @Test
    void methodMapTest(){
        hashMap.put("Один", 1);
        hashMap.put("Два", 2);
        int size = hashMap.size();
        Integer i = hashMap.get("Один");
        boolean empty = hashMap.isEmpty();
        Set<String> strings = hashMap.keySet();

        Assertions.assertAll(
                () -> Assertions.assertNotNull(hashMap),
                () -> Assertions.assertEquals(2, size),
                () -> Assertions.assertEquals(1, i),
                () -> Assertions.assertFalse(empty),
                () -> Assertions.assertNotNull(strings),
                () -> Assertions.assertInstanceOf(Set.class, strings)
        );
    }

    @Test
    void methodSetTest(){
        treeSet.add(3);
        int size = treeSet.size();
        boolean treeSetEmpty = treeSet.isEmpty();
        boolean contains = treeSet.contains(3);
        boolean containsAll = treeSet.containsAll(testList);
        boolean retainAll = treeSet.retainAll(testList);

        Assertions.assertAll(
                () -> Assertions.assertNotNull(treeSet),
                () -> Assertions.assertEquals(1, size),
                () -> Assertions.assertFalse(treeSetEmpty),
                () -> Assertions.assertTrue(contains),
                () -> Assertions.assertTrue(containsAll),
                () -> Assertions.assertTrue(retainAll)
        );
    }

    @Test
    void methodCollectionsForArrayList(){
        List<Integer> testList1 = new ArrayList<>(20);
        testList1.add(5);
        testList1.add(2);
        testList1.add(3);
        Assertions.assertAll("methodCollectionsForArrayList",
                () -> Collections.sort(testList1), //  Сортирует переданный в конструктор список: если список числовой, то по возрастанию, если строчный, то в алфавитном порядке.
                () -> Collections.swap(testList1, 0, 2), // используется для замены элементов в указанных позициях в указанном списке. Если указанные позиции равны, вызов этого метода оставляет список без изменений.
                () -> Collections.max(testList1), // Возвращает максимальный элемент переданного в конструктор списка.
                () -> Collections.min(testList1), // Возвращает минимальный элемент переданного в конструктор списка.
                () -> Collections.binarySearch(testList1, 1), // Возвращает индекс элемента, переданного в конструктор.
                () -> Collections.copy(testList1, arrayList), // копирует все значения из списка testList в arrayList
                () -> Collections.unmodifiableList(testList1), // Возвращает неизменяемое представление списка, переданного в конструктор
                () -> Collections.checkedList(testList1, Integer.class), // возвращает динамически типобезопасное представление списка, переданного в конструктор.
                () -> Collections.indexOfSubList(testList1, arrayList), // возвращает начальную позицию первого вхождения списка arrayList в список testList
                () -> Collections.fill(testList1, 2), // используется для замены всех элементов переданного в конструктор списка, элементом переданным в конструктор вторым аргументом.
                () -> Collections.reverse(testList1), // меняет местами элементы переданного в конструктор списка.
                () -> Collections.rotate(testList1, 2), // используется для поворота элементов, присутствующих в указанном списке коллекции, на заданное расстояние.
                () -> Collections.shuffle(testList1), // перемешивает элементы в списке.
                () -> Collections.lastIndexOfSubList(testList1, arrayList)); // используется для получения начальной позиции последнего вхождения указанного целевого списка в указанном исходном списке.
    }
}
