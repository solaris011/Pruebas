package es.codegym.task.pro.task15.task1525;

import java.io.*;
import java.util.Scanner;

/* 
Algo no está siendo copiado...
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             FileInputStream fis = new FileInputStream(scanner.nextLine());
             FileOutputStream fos = new FileOutputStream(scanner.nextLine())) {
            int size = 1024;
            byte[] buffer = new byte[size];
            while (fis.available() > 0) {
                int read = fis.read(buffer);
                fos.write(buffer, 0, read);
            }
            fis.close();
            fos.close();
        } catch (Exception e) {
            System.out.println("Algo salió mal : " + e);
        }
    }
}