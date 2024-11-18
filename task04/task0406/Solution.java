package es.codegym.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Mostramos lo que obtenemos
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salida = false;
        while (!salida) {
            String s = sc.nextLine();
            if (s.equalsIgnoreCase("basta")) {
                break;
            } else
                System.out.println(s);
        }



    }
}