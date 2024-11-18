package es.codegym.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
La fecha de nacimiento
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(1982, Calendar.JULY, 30);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        switch (dayOfWeek) {
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
        }
        return "Other day of the week";
    }
}
