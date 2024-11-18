package es.codegym.task.pro.task13.task1301;

import java.util.Collections;
import java.util.HashSet;

/* 
El procesamiento de una devolución
*/

public class Solution {
    public static void main(String[] args) {
        String[] array = {"In", "three", "years", "I", "will be a", "senior", "Java", "developer"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("___________________________________");

        HashSet<String> hashSet = arrayToHashSet(array);
        for(String s : hashSet) {
            System.out.println(s);
        }
    }

    public static HashSet<String> arrayToHashSet(String[] strings) {
        HashSet<String> hashSet1 = new HashSet<>();
        for (int i = 0; i < strings.length; i++) {
            hashSet1.add(strings[i]);
        }
        return hashSet1;
    }
}
