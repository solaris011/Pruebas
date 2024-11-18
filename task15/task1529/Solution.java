package es.codegym.task.pro.task15.task1529;

import java.io.*;
import java.util.Scanner;

/* 
Escribiendo caracteres en un archivo
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             FileWriter writer = new FileWriter(scanner.nextLine())) {
            char[] chars = new char[]{'j', 'a', 'v', 'a'};
            writer.write(chars);
        } catch (IOException e) {
            System.out.println("Algo salió mal : " + e);
        }
    }
}