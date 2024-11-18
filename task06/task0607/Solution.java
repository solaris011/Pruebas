package es.codegym.task.pro.task06.task0607;

/* 
Bienvenido! Pero no todos.
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static void signIn(String username) {
        if (username.equals("user")) {
            return;
        }
        System.out.println("Welcome, " + username);
        System.out.println("We've really missed you, " + username);
    }
}
