package ru.gb.lessons.lesson7.hw;

import ru.gb.lessons.lesson7.Graph;
import ru.gb.lessons.lesson7.GraphImpl;

public class GraphDemo {

    public static void main(String[] args) {
        GraphWithWeight graph = new GraphImplWithWeight();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");

        graph.addEdge("A", "D",5);
        graph.addEdge("A", "E",6);
        graph.addEdge("A", "F",7);

        graph.addEdge("B", "C",2);
        graph.addEdge("B", "D",4);

        graph.addEdge("C", "E",1);
        graph.addEdge("C", "F",2);

        graph.addEdge("D", "B",3);
        graph.addEdge("E", "F",2);
        graph.addEdge("F", "A",1);
        graph.addEdge("D", "E",4);

        System.out.println(graph);
        System.out.println();

        graph.dfs("A", System.out::print);
        System.out.println();
        graph.bfs("A", System.out::print);

    }


}
