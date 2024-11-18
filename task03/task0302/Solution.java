package es.codegym.task.pro.task03.task0302;

import java.util.Scanner;

/* 
Conscripcion
*/

public class Solution {
    public static void main(String[] args) {
        String militaryCommissar = ", has sido reclutado para el servicio militar";
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        int edad = sc.nextInt();

        if (edad >= 18 && edad <= 28) {
            System.out.println(nombre + militaryCommissar);
        }
    }
}
