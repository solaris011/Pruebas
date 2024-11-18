package es.codegym.task.pro.task03.task0310;

import java.util.Scanner;

/* 
Buscando el máximo
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 5) {
            System.out.println("El número es mayor que 5");
        } else if (number < 5) {
            System.out.println("El número es menor que 5");
        } else {
            System.out.println("El número es igual a 5");
        }
    }
}
