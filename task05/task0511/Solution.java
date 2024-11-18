package es.codegym.task.pro.task05.task0511;

import java.util.Random;
import java.util.Scanner;

/* 
<p>Creando un array bidimensional</p>
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        multiArray = new int[num1][];
        Random ran = new Random();

        for (int i = 0; i < num1; i++) {
            int num2 = sc.nextInt();
            multiArray[i] = new int[num2];
            for (int k = 0; k < multiArray[i].length; k++) {
                multiArray[i][k] = ran.nextInt(9) + 1;
                //System.out.print(multiArray[i][k] + " ");
            }
            //System.out.println();
        }


        for (int i = 0; i < multiArray.length; i++) {
            for (int k = 0; k < multiArray[i].length; k++) {
                System.out.print(multiArray[i][k] + " ");
            }
            System.out.println();
        }


    }
}
