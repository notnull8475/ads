package ru.gb.lessons.lesson2.hw;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public class Notebook {

    private double price;
    private int ram;
    private Brand brand;

    public enum Brand {
        Lenuvo, Asos, MacNote, Eser, Xamiou;

        public static Brand random() {
            return NotebookGenerator.getRandomValue(Arrays.asList(values()));
        }
    }

    @Override
    public String toString() {
        return "{" +
                "Price=" + price +
                ", RAM=" + ram +
                ", Brand=" + brand +
                '}';
    }
}
