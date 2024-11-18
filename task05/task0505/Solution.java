package es.codegym.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Invertir
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[1];

        if (num > 0)
            array = new int[num];

        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }

        if (num % 2 == 1) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i] + " ");
            }
        } else {
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.println(array[i] + " ");
            }
        }
    }
}
