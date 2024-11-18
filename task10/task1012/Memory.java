package es.codegym.task.pro.task10.task1012;

import java.util.*;


/* 
Defragmentación de memoria
*/

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        //Arrays.sort(array);
        //System.out.println(Arrays.toString(array));
        ArrayList<String> matriz = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                matriz.add(array[i]);
            }
        }
        //Collections.sort(matriz);
        String arr[] = new String[matriz.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = matriz.get(i);
        }
        //System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i];
        }
        //array = arr.clone();
        Arrays.fill(array, arr.length, array.length, null);
        //System.out.println(Arrays.toString(array));
    }
}
