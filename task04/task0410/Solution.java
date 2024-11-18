package es.codegym.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Segundo número más pequeño ingresado
*/

public class Solution {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;


        while (reader.hasNextInt()) {
            int x = reader.nextInt();
            if (x < min) {
                min2 = min;
                min = x;
            } else if (!(x == min)) {
                if (x < min2)
                    min2 = x;

            }
        }
        System.out.println(min2);

    }
}