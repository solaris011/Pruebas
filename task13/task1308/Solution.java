package es.codegym.task.pro.task13.task1308;

import java.util.ArrayList;
import java.util.Collections;

/* 
Estudiando los métodos de la clase Collections. Parte 3
*/

public class Solution {

    public static Integer min(ArrayList<Integer> list) {
        int min = Collections.min(list);
        return min;
    }

    public static Integer max(ArrayList<Integer> list) {
        int max = Collections.max(list);
        return max;
    }

    public static int frequency(ArrayList<Integer> list, Integer element) {
        int frequency = Collections.frequency(list, element);
        return frequency;
    }

    public static int binarySearch(ArrayList<Integer> list, Integer key) {

        int index = Collections.binarySearch(list, key);
        return index;
    }
}
