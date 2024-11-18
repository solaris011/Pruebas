package es.codegym.task.pro.task06.task0605;
//package org.apache.commons.lang3;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

//import java.util.A
/* 
El orden correcto
*/

public class Solution {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(array);
        reverseArray(array);
        //printArray(array);
    }

    public static void reverseArray(int[] array) {
        Integer[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> lista1 = Arrays.asList(nums);
        //ArrayList<int[]> lista1 = new ArrayList<>(Arrays.asList(array));

        Collections.reverse(lista1);
        System.out.println(Arrays.toString(lista1.toArray()));
        System.out.println();

        for (int i = 0; i < lista1.size(); i++)
            System.out.print(lista1.get(i) + " ");
        /*
        int end = array.length - 1;
        for (int i = 0; i < (array.length / 2); i++) {

            int temp = array[i];
            array[i] = array[end];
            array[end] = temp;
            end--;
        }
        */
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
