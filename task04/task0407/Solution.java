package es.codegym.task.pro.task04.task0407;

/* 
El resultado de la suma de los números que no son múltiplos de tres es:
*/

public class Solution {
    public static void main(String[] args) {
        int i = 0, sum = 0;
        while (i <= 99)
        {
            i++;
            if ( (i % 3) == 0)
                continue;
            sum += i;
        }
        System.out.println(sum);

    }
}