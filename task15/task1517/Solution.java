package es.codegym.task.pro.task15.task1517;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.stream.Stream;

/* 
Operaciones de archivos
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path filePath = Path.of(scanner.nextLine());
        Path fileNewPath = Path.of(scanner.nextLine());

        if (Files.notExists(filePath)) {
            Files.createFile(filePath);
        } else if (Files.exists(filePath)) {
            if (Files.notExists(fileNewPath)) {
                Files.move(filePath, fileNewPath);
            } else {
                Files.delete(filePath);
            }
        }
    }

    public static boolean isEmpty(Path path) throws IOException {
        if (Files.isDirectory(path)) {
            try (Stream<Path> entries = Files.list(path)) {
                return !entries.findFirst().isPresent();
            }
        }

        return false;
    }
}

