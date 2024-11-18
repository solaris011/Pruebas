package es.codegym.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Lectura de números
*/

public class Solution {

    public static void main(String[] args) {
        //escribe aquí tu código
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();
        
        int d = (a + b + c) / 3;
        
        System.out.println(d);
    }
}
