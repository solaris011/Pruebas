package es.codegym.task.pro.task04.task0414;

import java.util.Scanner;

/* 
<p>Nunca hay demasiado de una buena cosa</p>
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int num = sc.nextInt();
        if (num <= 0 || num >= 5)
            System.out.println(text);
        else{
            int i = 1;
            do {
                System.out.println(text);
                i++;
            } while (i <= num);
        }

    }
}