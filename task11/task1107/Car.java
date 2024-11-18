package es.codegym.task.pro.task11.task1107;

/* 
El motor es el corazón del coche.
*/

public class Car {
    //Engine engine = new Engine();

    public static class Engine {
        private boolean isRunning = false;

        public void start () {
            if (isRunning == false) {
                isRunning = true;
                System.out.println("Car is Running: " + isRunning);
            }
        }

        public void stop () {
            if (isRunning == true) {
                isRunning = false;
                System.out.println("Car is Running: " + isRunning);
            }
        }
    }
}
