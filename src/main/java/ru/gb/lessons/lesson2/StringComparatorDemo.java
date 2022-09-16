package ru.gb.lessons.lesson2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringComparatorDemo {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("a", "bs", "asdf", "asdfe", "ee", "xesd"));
        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s2.length(), s1.length());
            }
        });

        System.out.println(strings);
    }

}
