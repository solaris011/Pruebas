package es.codegym.task.pro.task11.task1105;

/* 
Trabajos de ventana
*/

public class Window {
    private int height = 2;
    private int width = 3;

    public void changeSize(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void printSize(){
        System.out.println("Altura = " + height);
        System.out.println("Ancho = " + width);
    }
}
