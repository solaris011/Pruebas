package es.codegym.task.pro.task16.task1601;

import java.util.Calendar;
import java.util.Date;

/* 
No solo el lunes :)
*/

public class Solution {

    static Date birthDate  = new Date("Jul 06 19:15:32 1973");

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        String str = "";
        int dia = date.getDay();
        switch (dia) {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
        }
        return str;
    }
}
