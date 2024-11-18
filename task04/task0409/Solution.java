package es.codegym.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Minimum of entered numbers
*/

public class Solution {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int min = Integer.MAX_VALUE;

        while (reader.hasNextInt()) {
            int x = reader.nextInt();
            if (x < min)
                min = x;
        }
        System.out.println(min);
    }
}