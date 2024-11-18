package es.codegym.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Suma
*/

public class Solution {
    public static void main(String[] args) {
        int suma = 0;
        int i = 0;
        Scanner sc = new Scanner(System.in);

        boolean salida = false;
        // salida = !input.equalsIgnoreCase("yes")

        while (!salida) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("enter")) {
                salida = true;
            } else {
                try {
                    suma += Integer.parseInt(input);
                } catch (Exception e) {
                    System.out.println("No es un numero!");
                }
            }
        }
        System.out.println(suma);
    }
}