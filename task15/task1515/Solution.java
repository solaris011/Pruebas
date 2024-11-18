package es.codegym.task.pro.task15.task1515;

import java.nio.file.Path;
import java.util.Scanner;

/* 
camino absoluto
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        boolean abs = Path.of(str).isAbsolute();
        if (!abs)
            System.out.println(Path.of(str).toAbsolutePath());

    }
}

