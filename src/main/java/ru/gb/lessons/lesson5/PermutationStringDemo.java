package ru.gb.lessons.lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class PermutationStringDemo {

    public static void main(String[] args) {
        String str = "abcde";
        List<String> permutations = permutations(str);
        System.out.println();
        System.out.println(permutations);
    }

    // abcde

    // a bcde
    // bcde => [bcde, bced, bdce, ...]
    // abcde, abced, abdce, ...

    // b acde
    // acde =>
    //          a cde
    //          cde => [...]
    // acde => [acde, aced, adce, ...]
    // bacde, baced, badce, ...
    public static List<String> permutations(String str) {
        List<String> permutations = new ArrayList<>();

        Consumer<String> print = System.out::println;
        Consumer<String> collect = print.andThen(permutations::add);

        permutationsRecursive(0, str, "", collect);
        return permutations;
    }

    private static void permutationsRecursive(int depth, String str, String answer, Consumer<String> resultAcceptor) {
        if (str.isEmpty()) {
            printDepth(depth);
            resultAcceptor.accept(answer);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            String withoutSymbol = str.substring(0, i) + str.substring(i + 1);

            printDepth(depth);
            System.out.println("Symbol: " + symbol + ", withoutSymbol: " + withoutSymbol +
                    ", answer + symbol = " + (answer + symbol));

            permutationsRecursive(depth + 1, withoutSymbol, answer + symbol, resultAcceptor);
        }
    }

    private static void printDepth(int depth) {
        System.out.print("\t".repeat(depth));
    }

}
