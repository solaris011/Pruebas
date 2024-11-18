package es.codegym.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Máximo de N números
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
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        System.out.println(max);
    }

}
