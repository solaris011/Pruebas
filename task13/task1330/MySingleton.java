package es.codegym.task.pro.task13.task1330;

/* 
Implementación de Singleton usando Enum
*/

public enum MySingleton {
    INSTANCE;

    MySingleton () {
        System.out.println("Creando una instancia...");
    }
}
