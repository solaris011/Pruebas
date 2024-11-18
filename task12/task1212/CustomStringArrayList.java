package es.codegym.task.pro.task12.task1212;

/* 
Creando nuestra propia lista
*/

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        capacity = (int) (capacity * 1.5);
        String[] newElements = new String[capacity];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
        /*
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i] + " ");
        }
        */
    }

}
