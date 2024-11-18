package es.codegym.task.pro.task07.task0706;

/* 
Extraña división
*/

public class Solution {
    public static void main(String[] args) {
        double a = 0.0 / 0.0;
        double b = a * 10;
        div(a, b);
    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}
