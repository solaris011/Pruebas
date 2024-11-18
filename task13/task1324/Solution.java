package es.codegym.task.pro.task13.task1324;

import java.util.Random;
import java.util.TreeMap;

/* 
Salarios y títulos de trabajo
*/

public class Solution {

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(0, "Newbie");
        map.put(20000, "Trainee");
        map.put(80000, "Junior developer");
        map.put(85000, "Strong junior developer");
        map.put(95000, "Mid-level developer");
        map.put(105000, "Strong mid-level developer");
        map.put(120000, "Senior developer");

        //Random random = new Random();
        int min = 0;
        int max = 119_500;
        for (int i = 0; i < 10; i++) {
            int salary = min + (int)(Math.random() * ((max - min) + 1));
            String position = getJobTitle(map, salary);
            System.out.printf("A salary of $%d corresponds to the job title \"%s\"%n", salary, position);
        }
    }

    public static String getJobTitle(TreeMap<Integer, String> map, Integer salary) {
        return map.floorEntry(salary).getValue();
    }
}