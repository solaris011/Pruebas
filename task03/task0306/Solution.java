package es.codegym.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Triángulo
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "Es un triángulo";
    private static final String TRIANGLE_DOES_NOT_EXIST = "No es un triángulo";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((a < (b + c)) && (b < (a + c)) && (c < (a + b))) {
            System.out.println("Es un triángulo");
        } else {
            System.out.println("No es un triángulo");
        }
    }
}
