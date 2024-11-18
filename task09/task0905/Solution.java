package es.codegym.task.pro.task09.task0905;

/* 
<p>Convertidor octal</p>
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Decimal number " + decimalNumber + " is equal to octal number " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Octal number " + octalNumber + " is equal to decimal number " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        int i = 0;
        int octalNum = 0;
        if (decimalNumber <= 0) {
            return octalNum;
        }
        while (decimalNumber != 0) {
            octalNum = (int) (octalNum + (decimalNumber % 8) * Math.pow (10, i));
            //el número octal = el número octal + (resto de la división del número decimal entre 8) * 10 a la potencia de i
            //el número decimal = el número decimal / 8
            decimalNumber = decimalNumber / 8;
            //aumentar i en 1
            i++;
        }
        return octalNum;
    }

    public static int toDecimal(int octalNumber) {
        int i = 0;
        int decimalNumber = 0;
        if (octalNumber <= 0) {
            return decimalNumber;
        }
        while (octalNumber != 0) {
            //el número decimal = el número decimal + (resto de la división del número octal entre 10) * 8 a la potencia de i
            //el número octal = el número octal / 10
            decimalNumber = (int) (decimalNumber + (octalNumber % 10) * Math.pow (8, i));
            octalNumber /= 10;
            i++;
        }
        return decimalNumber;
    }
}
