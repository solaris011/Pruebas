package es.codegym.task.pro.task15.task1530;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

/* 
Bytes para caracteres
*/

public class Solution {

    public static void main(String[] args) {
        ByteArrayInputStream stream = new ByteArrayInputStream("O sole, o sole mio!\nSta 'nfronte a te!\n Sta 'nfronte a te!".getBytes(StandardCharsets.UTF_8));
        System.out.println(new String(bytesToChars(stream, 38)));
    }

    public static char[] bytesToChars(ByteArrayInputStream stream, int n) {
        byte[] bytes = stream.readAllBytes();
        int minLength = Math.min(n, bytes.length);
        char[] array = new char[minLength];
        for (int i = 0; i < array.length; i++)
            array[i] = (char) bytes[i];
        return array;
    }
}
