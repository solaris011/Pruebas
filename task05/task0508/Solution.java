package es.codegym.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Eliminar cadenas duplicadas
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        strings = new String[6];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            strings[i] = sc.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
        String check = strings[i];
            for (int k = i + 1; k < strings.length; k++) {
                if (check == null) {
                    break;
                }

                if (check.equals(strings[k])) { //strings[k].equals(check)
                    strings[k] = null;
                    strings[i] = null;
                }
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
