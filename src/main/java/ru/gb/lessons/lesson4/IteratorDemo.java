package ru.gb.lessons.lesson4;

import java.util.*;

public class IteratorDemo {

    public static void main(String[] args) {
        Collection<Integer> coll = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        // [1 2 3 |4 5 6]

//        foreach(coll);
//        iterator(coll);
//        iteratorRemoveExample();
//        arrayForeach();

        LinkedList<Integer> customLinkedList = new LinkedListImpl<>();
        customLinkedList.addLast(1);
        customLinkedList.addLast(2);
        customLinkedList.addLast(3);
        customLinkedList.addLast(4);
        customLinkedList.addLast(5);
        // TODO: 22.09.2022 Реализовать итератор для связного списка.
        // TODO: 22.09.2022 Должно работать.
        for (Integer x : customLinkedList) {
            System.out.println(x);
        }

    }


    private static void iterator(Collection<Integer> coll) {
        Iterator<Integer> iterator = coll.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            System.out.println(integer);
        }
    }

    private static void foreach(Collection<Integer> coll) {
        // foreach
        for (Integer integer : coll) {
            System.out.println(integer);
        }
    }

    private static void arrayForeach() {
        int[] array = new int[]{1, 2, 3};
        for (int i : array) {
            System.out.println(i);
        }
    }

    private static Collection<Integer> iteratorRemoveExample() {
        Collection<Integer> coll = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        Iterator<Integer> iterator = coll.iterator();
        iterator.next(); // 1
        iterator.next(); // 2
        iterator.next(); // 3
        iterator.remove(); // remove 3
        return coll;
    }

}
