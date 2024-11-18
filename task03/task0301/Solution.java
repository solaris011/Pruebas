package es.codegym.task.pro.task03.task0301;

import java.util.Scanner;

/* 
Temperatura cálida o fría
*/

public class Solution {
    public static void main(String[] args) {
        String cold = "Hace frío afuera";
        String warm = "Hace calor afuera";
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        if (temp < 0) {
            System.out.print(cold);
        } else {
            System.out.print(warm);
        }
    }
}
