package es.codegym.task.pro.task03.task0309;

import java.util.Scanner;

/* 
Buscando el máximo
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        int c = numberA > numberB ? numberA : numberB;
        System.out.println(c);
    }
}
