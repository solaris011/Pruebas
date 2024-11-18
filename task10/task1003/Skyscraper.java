package es.codegym.task.pro.task10.task1003;

/* 
¡Construyamos un nuevo complejo empresarial: el Centro de Negocios CodeGym!
*/

public class Skyscraper {
    private int floorCount;
    private String developer;

    public Skyscraper () {
        this.floorCount = 5;
        this.developer = "CodeGymDevelopment";
    }
    public Skyscraper (int pisos, String developer) {
        this.floorCount = pisos;
        this.developer = developer;
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperUnknown = new Skyscraper(50, "Unknown");
    }
}
