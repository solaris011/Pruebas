package es.codegym.task.pro.task18.task1801;

import java.util.ArrayList;

/* 
Dos implementaciones de una interfaz
*/

public class Solution {
    public static ArrayList<java.lang.Runnable> list = new ArrayList<>();

    public static void main(String[] args) {
        addToList(new Car());
        addToList(new Plane());

        runList();
    }

    public static void addToList(java.lang.Runnable runnable) {
        list.add(runnable);
    }

    public static void runList() {
        for (java.lang.Runnable runnable : list) {
            runnable.run();
        }
    }
}