package es.codegym.task.pro.task07.task0711;

import java.util.Arrays;

/* 
Rellenando una matriz(array) de forma flexible
*/

public class Solution {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3, 1, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value, int begin, int end) {
        Arrays.fill(array, begin, end, value);
    }
}
