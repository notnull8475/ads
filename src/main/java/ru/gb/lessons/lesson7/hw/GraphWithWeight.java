package ru.gb.lessons.lesson7.hw;

import java.util.function.Consumer;

public interface GraphWithWeight {

    boolean addVertex(String label);

    // FIXME: 03.10.2022 Добавить возможность указывать вес ребра.
    //  Вес должен попадать в матрицу смежности.
    boolean addEdge(String from, String to, int weight);

    // FIXME: 03.10.2022 * Реализовать поиск кратчайшего расстояния между двумя узлами.

    /**
     * depth-first search
     */
    void dfs(String start, Consumer<String> visitor);

    /**
     * breadth-first search
     */
    void bfs(String start, Consumer<String> visitor);
}
