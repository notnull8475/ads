package ru.gb.lessons.lesson2.hw;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class NotebookGenerator {

    private static final List<Double> availablePrices = // [100.0, ..., 700.0]
            DoubleStream.iterate(100.0, it -> it + 100.0)
                    .limit(7)
                    .boxed().toList();

    private static final List<Integer> availableRams = // [4, 8, 12, 16, 20, 24]
            IntStream.iterate(4, it -> it + 4)
                    .limit(6)
                    .boxed().toList();

    public static List<Notebook> generate(int size) {
        return IntStream.range(0, size) // 0, size - 1
                .mapToObj(it -> generateRandomNotebook())
                .toList();
    }

    private static Notebook generateRandomNotebook() {
        return new Notebook(
                getRandomValue(availablePrices),
                getRandomValue(availableRams),
                Notebook.Brand.random()
        );
    }

    public static <T> T getRandomValue(List<T> list) {
        int randomIndex = ThreadLocalRandom.current().nextInt(0, list.size());
        return list.get(randomIndex);
    }

}
