package es.codegym.task.pro.task14.task1418;

/* 
Excepción personalizada
*/

import java.util.ArrayList;

public class Solution {
    public static String message = "The Human object's list of children appears to be uninitialized.";

    public static void main(String[] args) {
        Human amigo = new Human("Amigo", 25, new ArrayList<>());
        System.out.printf("Name: %s, age: %d, number of children: %d%n", amigo.getName(), amigo.getAge(), getChildrenCount(amigo));

        Human diego = new Human("Diego", 35);
        System.out.printf("Name: %s, age: %d, number of children: %d%n", diego.getName(), diego.getAge(), getChildrenCount(diego));
    }

    public static int getChildrenCount(Human human) {
        int size;
        try {
            size = human.getChildren().size();
        } catch (NullPointerException e) {
            throw new ChildrenNotInitializedException(message);
        }
        return size;
    }
}
