package es.codegym.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        
        System.out.println((double) a / b);
        int[] data = new int[10];
        for (int i = 0; i < 10; i++) {
            data[i] = i + 100;
            System.out.println(i);
        }
        
        

    }
}