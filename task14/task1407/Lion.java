package es.codegym.task.pro.task14.task1407;

/* 
La alegría y la tristeza duermen en la misma cama.
*/

public class Lion {

    public void eat(Food food) {
        try {
            System.out.println();
            System.out.println("buscando comida");
            System.out.println("encontré " + food.name);
            System.out.println("comí todo");
        } catch (NullPointerException e) {
            System.out.println("no encontré nada");
            return;
        } finally {
            System.out.println("me fui a la cama" + (food == null ? " hambriento" : ""));
        }


    }
}