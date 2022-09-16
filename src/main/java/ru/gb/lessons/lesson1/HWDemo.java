package ru.gb.lessons.lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HWDemo {

    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(10, 1000, 10_000, 100_000, 1_000_000);
        for (Integer d : data) {
            System.out.println("[" + d + "]: " + foo(d));
        }
    }

    private static int foo(int t) {
        // i, j = 0 ----------------------------------------------------- n
        //

        int counter = 0;
        int n = t;
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < n; l++) {
                        arrayList.add(i * j);
//                        n--;
                        counter++;
                    }
                }
            }
            System.out.println("\tn = " + n);
        }

        return counter;
    }

}
