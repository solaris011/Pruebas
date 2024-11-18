package es.codegym.task.pro.task09.task0913;

/* 
Buscar en una cadena
*/

public class Solution {
    public static void main(String[] args) {
        String string = "To become a programmer, you need to write code. To write code, you have to learn. To learn, you need desire.";
        String word = "code";
        int indexOfFirstWord = getIndexOfFirstWord(string, word);
        int indexOfLastWord = getIndexOfLastWord(string, word);
        System.out.println("The index of the first character of the first instance of the word \"" + word + "\" is " + indexOfFirstWord);
        System.out.println("The index of the first character of the last instance of the word \"" + word + "\" is " + indexOfLastWord);
    }

    public static int getIndexOfFirstWord(String string, String word) {
        int indice = string.indexOf(word);

        if (indice != 0) {
            return indice;
        } else {
            return 0;
        }

    }

    public static int getIndexOfLastWord(String string, String word) {
        int indice = string.lastIndexOf(word);

        if (indice != 0) {
            return indice;
        } else {
            return 0;
        }
    }
}
