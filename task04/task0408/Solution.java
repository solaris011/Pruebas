package es.codegym.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Máximo de números introducidos
*/

public class Solution {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        while (reader.hasNextInt()) {
            int x = reader.nextInt();
            if (x > max && x % 2 == 0)
                max = x;
        }
        System.out.println(max);

    }
}