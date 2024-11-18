package es.codegym.task.pro.task15.task1502;

import java.util.Scanner;

/* 
Volver a lo básico
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            System.out.println(line.toUpperCase());
        } catch (Exception e) {
            System.out.println("Algo salió mal : " + e);
        } finally {
            scanner.close();
        }
    }
}
