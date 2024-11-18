package es.codegym.task.pro.task03.task0314;

import java.util.Scanner;

/* 
Teclado roto
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        if (text.equalsIgnoreCase(secret))
            System.out.println("Acceso permitido");
        else
        System.out.println("Acceso denegado");
    }
}
