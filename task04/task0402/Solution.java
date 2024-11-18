package es.codegym.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Todos quieren ser amados.
*/

public class Solution {
    public static void main(String[] args) {
        String text = " loves me.";
        Scanner sc = new Scanner(System.in);
        String love = sc.nextLine();
        int i = 0;
        while (i < 10) {
            System.out.println(love + text);
            i++;
        }

    }
}
