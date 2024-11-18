package es.codegym.task.pro.task05.task0502;

/* 
Celdas pares e impares de una matriz
*/

public class Solution {
    public static final String ODD = "Odd";
    public static final String EVEN = "Even";
    public static String[] strings = new String[5];

    public static void main(String[] args) {
        strings[0] = "Even";
        strings[1] = "Odd";
        strings[2] = "Even" ;
        strings[3] = "Odd";
        strings[4] = "Even" ;

        System.out.print("index = 0");
        System.out.println(" value = " + strings[0]);
        System.out.print("index = 1");
        System.out.println(" value = " + strings[1]);
        System.out.print("index = 2");
        System.out.println(" value = " + strings[2]);
        System.out.print("index = 3");
        System.out.println(" value = " + strings[3]);
        System.out.print("index = 4");
        System.out.println(" value = " + strings[4]);
    }
}
