package es.codegym.task.pro.task05.task0516;

import java.util.Arrays;

/* 
Rellenando una matriz (array)
*/

public class Solution {

    public static int[] array = new int[9];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        if (array.length % 2 == 0) {
            int mitad = array.length / 2;
            Arrays.fill(array, 0, mitad, valueStart);
            Arrays.fill(array, mitad , array.length, valueEnd);

        } else {
            int mitad = array.length / 2 + 1;
            Arrays.fill(array, 0, mitad, valueStart);
            Arrays.fill(array, mitad , array.length, valueEnd);
        }
        System.out.println(Arrays.toString(array));
    }
}
