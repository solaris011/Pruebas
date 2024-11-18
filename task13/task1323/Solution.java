package es.codegym.task.pro.task13.task1323;

import java.util.ArrayList;
import java.util.HashSet;

import static java.util.Arrays.asList;

/* 
Convertir una lista a un conjunto
*/

public class Solution {

    public static void main(String[] args) {
        ArrayList<String> listOfWords = new ArrayList<>(asList(
                "A new series of Java programming books has been released: \"Java for Beginners\", \"Java for Professionals\", \"Java for Graduates\""
                .split(" ")));
        System.out.println("Number of words in the list: " + listOfWords.size());
        HashSet<String> setOfWords = listToSet(listOfWords);
        System.out.println("Number of words in the set: " + setOfWords.size());
    }

    public static HashSet<String> listToSet(ArrayList<String> listOfWords) {
        HashSet<String> result = new HashSet<>();
        for (int i = 0; i < listOfWords.size(); i++) {
            result.add(listOfWords.get(i));
        }

        return result;
    }
}