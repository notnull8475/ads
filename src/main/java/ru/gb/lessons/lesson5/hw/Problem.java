package ru.gb.lessons.lesson5.hw;

import java.util.*;
import java.util.function.Consumer;

public class Problem {

    /**
     * Есть рюкзак, который вмещает x кг чего-то.
     * Есть n вещей. У каждой вещи есть ее вес p и стоимость q. p, q > 0.
     * <p>
     * Требуется максимизировать сумарную стоимость с учетом не превышения сумарного веса.
     * <p>
     * Найти самый дорогой вмещаемый набор.
     */

    static class Bag {
        private int maxMass;

        Bag(int maxMass) {
            this.maxMass = maxMass;
        }

        public int getMaxMass() {
            return maxMass;
        }
    }

    static class Thing implements Comparable {
        private int price, mass;

        Thing(int price, int mass) {
            this.price = price;
            this.mass = mass;
        }

        public int getPrice() {
            return price;
        }

        public int getMass() {
            return mass;
        }

        @Override
        public int compareTo(Object o) {
            if (this.price == ((Thing) o).price) return Integer.compare(((Thing) o).mass, this.mass);
            else return Integer.compare(this.price, ((Thing) o).price);
        }

        @Override
        public String toString() {
            return "Thing{" +
                    "price=" + price +
                    ", mass=" + mass +
                    '}';
        }
    }

    // x = 10
    // [p, q]: [3, 6], [3, 4], [10, 9]

    public static List<Thing> feelBag(List<Thing> things, Bag bag) {
        List<List<Thing>> variants = new ArrayList<>();
        Consumer<List<Thing>> c = variants::add;

        tryFeel(things, bag, c);
        List<Thing> bestList = variants.get(0);
        int bestPrice = 0;
        for (Thing i:bestList) {
            bestPrice += i.getPrice();
        }
        for (List<Thing> list : variants) {
            int listPrice = 0;
            for (Thing t : list) {
                listPrice += t.getPrice();
            }
            if (bestPrice<listPrice){
                bestPrice = listPrice;
                bestList = list;
            }
        }
        return bestList;
    }

    private static void tryFeel(List<Thing> list, Bag bag, Consumer<List<Thing>> consumer) {
        int massOfList = 0;
        for (Thing l : list) {
            massOfList += l.getMass();
        }
        if (list.size()>0) {
            if (bag.getMaxMass() < massOfList) {

                for (Thing t : list) {
                    List<Thing> tmp = new ArrayList<>(list);
                    tmp.remove(t);
                    tryFeel(tmp, bag, consumer);
                }
            } else consumer.accept(list);
        }
    }


    public static void main(String[] args) {
        int bagInboundMass = 10;
        int thingsQuantity = 10;

        Bag bag = new Bag(bagInboundMass);
        List<Thing> things = new ArrayList<>();

        Random r = new Random();
        for (int i = 0; i < thingsQuantity; i++) {
            things.add(new Thing(r.nextInt(1, 10), r.nextInt(1, 10)));
        }

        things.sort(Collections.reverseOrder());

//        System.out.println(things);

        System.out.println(feelBag(things, bag));
    }


}
