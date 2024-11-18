package es.codegym.task.pro.task12.task1214;

import java.util.ArrayList;
import java.util.Arrays;

/* 
¡Adiós, Pascal!
*/

public class Solution {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        //int index = programmingLanguages.indexOf("Pascal");
        programmingLanguages.remove("Pascal");

        for (int i = 0; i < programmingLanguages.size(); i++) {
            System.out.println(programmingLanguages.get(i));
        }



    }
}
