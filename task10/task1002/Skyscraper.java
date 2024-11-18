package es.codegym.task.pro.task10.task1002;

/* 
Construyamos un nuevo complejo residencial: CodeRush Towers
*/

public class Skyscraper {
    public static final String SKYSCRAPER_WAS_BUILT = "El rascacielos fue construido.";
    public static final String SKYSCRAPER_WAS_BUILT_FLOOR_COUNT = "El rascacielos fue construido. Número de pisos: ";
    public static final String SKYSCRAPER_WAS_BUILT_DEVELOPER = "El rascacielos fue construido. Desarrollador: ";

    public Skyscraper () {
        System.out.println(SKYSCRAPER_WAS_BUILT);
    }

    public Skyscraper (int pisos) {
        System.out.println(SKYSCRAPER_WAS_BUILT_FLOOR_COUNT + pisos);
    }

    public Skyscraper (String developer) {
        System.out.println(SKYSCRAPER_WAS_BUILT_DEVELOPER + developer);
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperTower = new Skyscraper(50);
        Skyscraper skyscraperSkyline = new Skyscraper("CodeGymDevelopment");
    }
}

