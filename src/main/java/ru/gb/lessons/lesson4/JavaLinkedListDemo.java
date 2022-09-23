package ru.gb.lessons.lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class JavaLinkedListDemo {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        // Внутри себя хранит данные в массиве.

        List<Integer> linkedList = new LinkedList<>();
        // Внутри себя хранит данные в виде цепочки узлов.

        // [1, 2, 3, 4, 5]
        Collections.addAll(arrayList, 1, 2, 3, 4, 5);

        // [1, [2, [3, [4, [5, null]]
        // 1 -> 2 -> 3 -> x -> 4 -> 5 -> null
        Collections.addAll(linkedList, 1, 2, 3, 4, 5);

        //                      ArrayList       LinkedList
        // list.add(x)          O(1)            O(1)
        // list.get(index)      O(1)            O(n)
        // list.add(x, index)   O(n)            O(n)
        // list.delete(index)   O(n)            O(n)
        // list.add(x, 0)       O(n)            O(1)

    }

}
