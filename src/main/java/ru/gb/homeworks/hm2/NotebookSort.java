package ru.gb.homeworks.hm2;

import ru.gb.lessons.lesson2.InsertionSort;
import ru.gb.lessons.lesson2.SelectionSort;

import java.util.Arrays;
import java.util.Random;

public class NotebookSort {

    /*
     * Необходимо отсортировать массив, состоящий из экземпляров класса Notebook в количестве 10000 штук.

     * Класс Notebook содержит поля:
     * 1. Стоимость - price, double [100, 200, 300, 400, 500, 600, 700]
     * 2. Оперативная память - ram, integer [4, 8, 16, 20, 24]
     * 3. Производитель - brand, enum
     * 3.1. Перечисление Brand может принимать следующие значения: Lenuvo, Asos, MacNote, Eser, Xamiou. Сортировать нужно в этом же порядке (т.е. Lenuvo имеет наивысший приоритет).
     *
     * Отсортировать:
     * 1. По стоимости
     * 2. По оперативной памяти
     * 3. По бренду

     * *** Вынести логику сортировки в отдельное место. Пусть это место использует Comparator
     * */

    public static void main(String[] args) {
        Notebook[] notebooks = getNotebooks(10);
        System.out.println(Arrays.toString(notebooks));
        NotebookComparator comp = new NotebookComparator();
        InsertionSort.sort(notebooks,comp);
        System.out.println(Arrays.toString(notebooks));
    }


    private static Notebook[] getNotebooks(int l){
        Random r = new Random();
        Notebook[] notebooks = new Notebook[l];
        for (int i = 0; i < notebooks.length; i++) {
            notebooks[i] = new Notebook.Builder()
                    .setPrice(TTC.price[r.nextInt(0,TTC.price.length-1)])
                    .setRam(TTC.ram[r.nextInt(0,TTC.ram.length-1)])
                    .setBrand(Brand.randomBrand())
                    .build();
        }
        return notebooks;
    }

}
