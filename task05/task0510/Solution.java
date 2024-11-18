package es.codegym.task.pro.task05.task0510;

/* 
Array triangular
*/

public class Solution {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        for (int i = 0; i < result.length; i++) {
            result[i] = new int[i + 1];
            for (int k = 0; k < result[i].length; k++) {
                result[i][k] = i + k;
                System.out.print(result[i][k] + " ");

            }
            System.out.println();
        }

    }
}
