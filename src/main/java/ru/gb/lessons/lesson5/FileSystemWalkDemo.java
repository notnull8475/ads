package ru.gb.lessons.lesson5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileSystemWalkDemo {

    public static void main(String[] args) throws IOException {
        Path root = Path.of("root");
        walkPathRecursive(0, root);
    }

    private static void walkPathRecursive(int depth, Path path) throws IOException {
        List<Path> children = Files.list(path).toList();
        for (Path child : children) {
            if (Files.isRegularFile(child)) {
                printDepth(depth);
                System.out.println("Найден файл \"" + child.getFileName().toString() + "\"");
                printDepth(depth);
                System.out.println("Содержимое: " + Files.readString(child));
            } else if (Files.isDirectory(child)) {
                printDepth(depth);
                System.out.println("Найдена директория \"" + child.getFileName().toString() + "\"");
                printDepth(depth);
                System.out.println("Будет выполнен поиск вниз");
                walkPathRecursive(depth + 1, child);
            }
        }
    }

    private static void printDepth(int depth) {
        System.out.print("\t".repeat(depth));
    }

}
