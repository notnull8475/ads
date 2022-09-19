package ru.gb.lessons.lesson3;

import java.util.List;
import java.util.Optional;

public class LambdasDemo {

    public static void main(String[] args) {
        List<Integer> ints = List.of(1, 2, 3, 4, 5);

//        ints.stream()
//                .filter(it -> it >= 3)
//                .map(it -> it * 2)
////                .forEach(new Consumer<Integer>() {
////                    @Override
////                    public void accept(Integer integer) {
////                        System.out.println(integer);
////                    }
////                })
////                .forEach(it -> System.out.println(it))
//                .forEach(System.out::println);


        Optional<Integer> reduce = ints.stream()
//                .reduce(new BinaryOperator<Integer>() {
//                    @Override
//                    public Integer apply(Integer integer, Integer integer2) {
//                        return null;
//                    }
//                })
//                .reduce((a1, a2) -> a1 + a2);
                .filter(LambdasDemo::isPositive)
                .reduce(Integer::max);

        System.out.println(reduce.get());

    }

    private static boolean isPositive(int x) {
        return x > 0;
    }

}
