package es.codegym.task.pro.task03.task0304;

import java.util.Scanner;

/* 
Vamos a tomar tu temperatura
*/

public class Solution {
    private static boolean isHigh;
    private static boolean isLow;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bodyTemperature = scanner.nextDouble();
        isHigh = bodyTemperature > 37;
        isLow = bodyTemperature < 36;
        //escribe aquí tu código
        if (isHigh) {
            System.out.println("La temperatura corporal es alta");
        } else if (isLow) {
            System.out.println("La temperatura corporal es baja");
        } else {
            System.out.println("La temperatura corporal es normal");
        }
    }
}
