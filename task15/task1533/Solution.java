package es.codegym.task.pro.task15.task1533;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* 
Reemplazando una secuencia
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        writeData("Justinian", "Justinian@mega.city.one", 41, 391);
    }

    public static ByteArrayOutputStream writeData(String name, String email, int level, int rating) throws IOException {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        stream.write(("Name: " + name + "\n").getBytes(StandardCharsets.UTF_8));
        stream.write(("Email: " + email + "\n").getBytes(StandardCharsets.UTF_8));
        stream.write(("Level: " + level + "\n").getBytes(StandardCharsets.UTF_8));
        stream.write(("Rating: " + rating + "\n").getBytes(StandardCharsets.UTF_8));

        return stream;
    }
}
