package es.codegym.task.pro.task15.task1516;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Archivo o directorio
*/

public class Solution {
    private static final String THIS_IS_FILE = " - Este es un archivo";
    private static final String THIS_IS_DIR = " - Este es un directorio";

    public static void main(String[] args) {
        boolean isTrue = true;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            if (Files.isRegularFile(Path.of(str)))
                System.out.println(str + THIS_IS_FILE);
            else if (Files.isDirectory(Path.of(str)))
                System.out.println(str + THIS_IS_DIR);
            else
                break;
        }
    }
}

