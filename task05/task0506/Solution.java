package es.codegym.task.pro.task05.task0506;

import java.util.Scanner;

/* 
Minimum of N numbers
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        array = new int[num];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        System.out.println(min);
    }
}
