package ru.gb.lessons.lesson2;

import ru.gb.lessons.Utility;

import java.util.Arrays;
import java.util.function.Consumer;

public class SortMain {

    public static void main(String[] args) {
        SortAlgorithm[] algorithms = {
                SortAlgorithm.ofName("BubbleSort", BubbleSort::sort),
                SortAlgorithm.ofName("SelectionSort", SelectionSort::sort),
//                SortAlgorithm.ofName("InsertionSort", InsertionSort::sort),
                SortAlgorithm.ofName("JavaSort", Arrays::sort)
        };



        int[] sourceArray = Utility.randomIntArray(100_000, 1, 20_000);
        Arrays.sort(sourceArray);

        for (SortAlgorithm algorithm : algorithms) {
            int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
            long start = System.currentTimeMillis();
            algorithm.sort(arr);
            long end = System.currentTimeMillis();
            System.out.println("[" + algorithm.name() + "] Time: " + (end - start) + "ms");
        }
    }

    public interface SortAlgorithm {
        void sort(int[] array);

        String name();

        static SortAlgorithm ofName(String name, Consumer<int[]> sorter) {
            return new SortAlgorithm() {
                @Override
                public void sort(int[] array) {
                    sorter.accept(array);
                }

                @Override
                public String name() {
                    return name;
                }
            };
        }
    }

}
