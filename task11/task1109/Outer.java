package es.codegym.task.pro.task11.task1109;

/* 
Objetos de clases internas y anidadas.
*/

public class Outer {
    class Inner {
         protected void Inner() {
            System.out.println("Creating an object of an inner class");
        }
    }
    static class Nested {
        protected void Nested() {
            System.out.println("Creating an object of a nested class");
        }
    }
}
