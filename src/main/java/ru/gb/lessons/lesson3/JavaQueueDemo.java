package ru.gb.lessons.lesson3;

import java.util.ArrayDeque;
import java.util.Deque;

public class JavaQueueDemo {

    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>(); // double ended queue
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        queue.addFirst(-1);
        queue.addLast(10);

        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());

        System.out.println(queue);


        System.out.println("STACK");
        Deque<Integer> stack = new ArrayDeque<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        System.out.println(stack);

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

    }

}
