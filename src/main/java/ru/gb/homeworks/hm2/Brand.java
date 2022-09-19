package ru.gb.homeworks.hm2;

import java.util.List;
import java.util.Random;

public enum Brand {
    Lenuvo,
    Asos,
    MacNote,
    Eser,
    Xamiou;

    private static final List<Brand> VALUES = List.of(values());
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Brand randomBrand() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
