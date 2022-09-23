package ru.gb.lessons.lesson4;

public class CustomLinkedListDemo {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedListImpl<>();
        System.out.println("Empty: " + list);

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        System.out.println("Filled: " + list);




    }

}
