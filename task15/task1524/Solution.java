package es.codegym.task.pro.task15.task1524;

import java.io.*;
import java.util.Scanner;

/* 
M bytes
*/

public class Solution {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in))
        {
            FileInputStream file1 = new FileInputStream(sc.nextLine());
            FileOutputStream file2 = new FileOutputStream(sc.nextLine());

            byte[] bytesIn = file1.readAllBytes();
            byte[] bytesOut = new byte[bytesIn.length];

            for (int i = 0; i < bytesIn.length; i += 2) {
                if (i < bytesIn.length - 1) {
                    bytesOut[i] = bytesIn[i + 1];
                    bytesOut[i + 1] = bytesIn[i];
                } else {
                    bytesOut[i] = bytesIn[i];
                }
            }
            file2.write(bytesOut);
            file1.close();
            file2.close();

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}