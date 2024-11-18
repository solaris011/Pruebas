package es.codegym.task.pro.task15.task1527;

import java.io.*;
import java.util.Scanner;

/* 
No todos pasarán
*/

public class Solution {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);
                FileReader in = new FileReader(sc.nextLine());
            BufferedReader reader = new BufferedReader(in))
        {
            int count = 2;
            while (reader.ready())
            {
                if (count % 2 == 0) {
                    String line = reader.readLine();
                    System.out.println(line);

                } else {
                    String line = reader.readLine();
                }
                count++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}