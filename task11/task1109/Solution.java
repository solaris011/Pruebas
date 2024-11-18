package es.codegym.task.pro.task11.task1109;

/* 
Objetos de clases internas y anidadas.
*/

public class Solution {
    public static void main(String[] args) {
        Outer.Inner inn = new Outer().new Inner();
        inn.Inner();

        Outer.Nested nest = new Outer.Nested();
        nest.Nested();
    }
}
