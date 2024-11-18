package es.codegym.task.pro.task10.task1005;

/* 
Serial empresario
*/

public class Building {
    private String type;

    public void initialize (String tipoDeEdif) {
        this.type = tipoDeEdif;
    }

    public static void main(String[] args) {
        Building building = new Building();
        building.initialize("Barbershop");
    }
}
