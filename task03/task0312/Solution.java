package es.codegym.task.pro.task03.task0312;

import java.util.Scanner;

/* 
<p>Comparación de strings</p>
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a =  sc.nextLine();
        String b =  sc.nextLine();

        if (a.equals(b))
            System.out.println("Las cadenas son iguales");
        else
            System.out.println("Las cadenas son diferentes");
    }
}
