package es.codegym.task.pro.task09.task0919;

/* 
Inviertiendo cadenas
*/

public class Solution {
    public static void main(String[] args) {
        String string = "The cat is walking backwards";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder builder = new StringBuilder(string);
        builder.reverse();
        String nuevo = builder.toString();
        return nuevo;
    }
}
