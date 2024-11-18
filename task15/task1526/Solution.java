package es.codegym.task.pro.task15.task1526;

import java.io.*;
import java.util.Scanner;

/* 
Control de caras
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            FileReader reader = new FileReader(sc.nextLine());

            while (reader.ready()) {
                char ch = (char) reader.read();
                if (ch != ' ' && ch != '.' && ch != ','){
                    System.out.print(ch);
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Excepcion: " + e);
        }
    }
}