package es.codegym.task.pro.task04.task0405;

/* 
Rectángulo no relleno
*/

public class Solution {
    public static void main(String[] args) {
        int m = 0;

        while (m < 10)
        {
            int n = 0;
            while (n < 20)
            {
                if ((m == 0) || (m == 9)) {
                    System.out.print("B");
                    n++;
                } else {
                    if ((n == 0) || (n == 19)) {
                        System.out.print("B");
                        n++;
                    } else {
                        System.out.print(" ");
                        n++;
                    }
                }


                //}
            }
            System.out.println();
            m++;
        }
    }
}