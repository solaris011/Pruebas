package es.codegym.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Rendimiento del estudiante
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Tom Misaki", 83.55);
        grades.put("Oliver Atom", 71.39);
        grades.put("Steve Morales", 62.08);
        grades.put("Raul Barrera", 91.87);
        grades.put("Ricardo Lozoya", 48.99);

    }
}
