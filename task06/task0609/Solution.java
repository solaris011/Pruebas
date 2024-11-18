package es.codegym.task.pro.task06.task0609;

/* 
Un calculador de cubos cúbicos
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static long cube(long a) {
        return a * a * a;
    }

    public static long ninthDegree(long a) {
        long b = cube(a);
        long c = cube(b);
        return c;
    }
}
