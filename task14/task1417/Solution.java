package es.codegym.task.pro.task14.task1417;

/* 
Validador de fecha
*/

import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the date in the format dd.mm.yyyy: ");
        String date = scanner.nextLine();
        validateDate(date);
        System.out.println("\nThe date is valid.");
    }

    public static void validateDate(String date) {
        checkDateFormat(date);
        checkYearValue(date);
        checkMonthValue(date);
        checkDayValue(date);
    }

    public static void checkDateFormat(String date) {
        if (!date.matches("\\d{2}\\.\\d{2}\\.\\d{4}"))
            throw new InvalidDateFormatException();
    }

    public static void checkYearValue(String date) {
        int year = Integer.parseInt(date.substring(date.lastIndexOf('.') + 1));
        if (year < 1900 || year > 2100)
            throw new InvalidYearValueException();
    }

    public static void checkMonthValue(String date) {
        int month = Integer.parseInt(date.substring(date.indexOf('.') + 1, date.lastIndexOf('.')));
        if (month < 1 || month > 12)
            throw new InvalidMonthValueException();
    }

    public static void checkDayValue(String date) {
        HashMap<Integer, Integer> months = new HashMap<>(){{
            put(1, 31);
            put(2, 29);
            put(3, 31);
            put(4, 30);
            put(5, 31);
            put(6, 30);
            put(7, 31);
            put(8, 31);
            put(9, 30);
            put(10, 31);
            put(11, 30);
            put(12, 31);
        }};
        String[] cadena = date.split("\\.");
        int dia = Integer.parseInt(cadena[0]);
        int mes = Integer.parseInt(cadena[1]);
        int diasEnMes = months.get(mes);

        if (dia < 1 || dia > diasEnMes)
            throw new InvalidDayValueException();
    }
}
