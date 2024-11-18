package es.codegym.task.pro.task13.task1310;

import java.util.HashMap;

/* 
Desempeño del estudiante - 2
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println("Lista de estudiantes: ");
        printStudents();
        System.out.print("Nota media: " + getAverageMark());
    }

    public static void addStudents() {
        grades.put("William Butler Yeats", 4.3d);
        grades.put("Emily Dickenson", 4.1d);
        grades.put("William Shakespeare", 4.9d);
        grades.put("Maya Angelou", 3.7d);
        grades.put("Shel Silverstein", 3.2d);
    }

    public static void printStudents() {
        for (String key : grades.keySet()) {
            //Double value = grades.get(key);
            System.out.println(key);
        }
    }

    public static Double getAverageMark() {
        int sum = 0, count = 0;
        double avg = 1.0d;
        for (String key : grades.keySet()) {
            Double value = grades.get(key);
            count++;
            sum += value;
        }
        avg = (1.0d) * sum / count;
        return avg;
    }
}
