package es.codegym.task.pro.task11.task1104;

/* 
Convertidor de cadenas
*/

public class Solution {
    public static void main(String[] args) {
        String string = "12.84";
        System.out.println((int)parseDouble(string));
    }

    static double parseDouble (String str) {
        return Math.round( Double.parseDouble(str));
    }
}
