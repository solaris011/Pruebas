package es.codegym.task.pro.task15.task1532;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* 
Cifrado
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(encrypt("abcdefghi"));
    }

    public static ByteArrayOutputStream encrypt(String message) {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();

        byte[] bytes = message.getBytes(StandardCharsets.UTF_8);
        int longitud = bytes.length;

        for (int i = 0; i < longitud / 2; i++) {
            stream.write(bytes[i]);
            System.out.print((char) bytes[i]);
            stream.write(bytes[longitud - i -1]);
            System.out.print((char) bytes[longitud -i -1]);
        }

        if (longitud % 2 == 1) {
            stream.write(bytes[longitud / 2]);
            System.out.print((char) bytes[longitud / 2]);
        }

        System.out.println();
        return stream;
    }
}
