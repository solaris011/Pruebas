package es.codegym.task.pro.task13.task1318;

/* 
El próximo mes, por favor
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        int index = month.ordinal();
        if (index == 11) {
            return Month.JANUARY;
        } else {
            return Month.values()[index + 1];
        }

    }
}
