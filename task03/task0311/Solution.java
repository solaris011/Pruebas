package es.codegym.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Alta precisión
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if ( Math.abs(b - a) < 0.000001 )
            System.out.println("Los números son iguales");
        else
            System.out.println("Los números no son iguales");
    }
}
