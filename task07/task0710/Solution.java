package es.codegym.task.pro.task07.task0710;

import java.util.Arrays;

/* 
Conjunto de valores
*/

public class Solution {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value){
        Arrays.fill(array, value);
    }
}
