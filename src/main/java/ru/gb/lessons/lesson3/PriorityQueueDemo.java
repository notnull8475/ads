package ru.gb.lessons.lesson3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

    public static void main(String[] args) {
//        Queue<PriorityInteger> queue = new PriorityQueue<>((o1, o2) -> Integer.compare(o2.getPriority(), o1.getPriority()));
        Queue<PriorityInteger> queue =
                new PriorityQueue<>(Comparator.comparingInt(PriorityInteger::getPriority).reversed());

        queue.add(new PriorityInteger(1, 5));
        queue.add(new PriorityInteger(2, 3));
        queue.add(new PriorityInteger(3, 10));
        queue.add(new PriorityInteger(3, 10));
        queue.add(new PriorityInteger(3, 10));
        queue.add(new PriorityInteger(3, 10));
        queue.add(new PriorityInteger(4, -4));
        queue.add(new PriorityInteger(5, 0));

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());


    }

    @Getter
    @AllArgsConstructor
    @ToString
    private static class PriorityInteger {

        private int value;
        private int priority;

//        public PriorityInteger(int value, int priority) {
//            this.value = value;
//            this.priority = priority;
//        }

//        public int getValue() {
//            return value;
//        }
//
//        public int getPriority() {
//            return priority;
//        }
    }

}
