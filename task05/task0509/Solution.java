package es.codegym.task.pro.task05.task0509;

/* 
Tabla de multiplicación
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10];

        int num = 1;
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                MULTIPLICATION_TABLE[i][k] = (k + 1) * num;
                System.out.print(MULTIPLICATION_TABLE[i][k] + " ");
            }
            num++;
            System.out.println();
        }

    }
}
