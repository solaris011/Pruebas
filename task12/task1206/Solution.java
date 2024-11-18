package es.codegym.task.pro.task12.task1206;

/* 
Analizando las cadenas
*/

public class Solution {

    public static void main(String[] args) {
        String string = "I think this will be a new feature. " +
                "Just don't tell anyone that it was an accident.";

        System.out.println("Number of digits in the string: " + countDigits(string));
        System.out.println("Number of letters in the string: " + countLetters(string));
        System.out.println("Number of spaces in the string: " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int count = 0;
        for(int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i)))
                count++;

        }
        return count;
    }

    public static int countLetters(String string) {
        int count = 0;
        for(int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i)))
                count++;
        }
        return count;
    }

    public static int countSpaces(String string) {
        int count = 0;
        for (char c : string.toCharArray()) {
            if (c == ' ') {
                count++;
            }
        }
        return count;
    }
}
