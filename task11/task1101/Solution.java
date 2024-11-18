package es.codegym.task.pro.task11.task1101;

/* 
El sistema solar es nuestro hogar.
*/

public class Solution {

    public static void main(String[] args) {

        System.out.println("La humanidad vive en el Sistema Solar.");
        System.out.println("Tiene aproximadamente " + SolarSystem.age + " años de antigüedad.");
        System.out.println("El Sistema Solar tiene " + SolarSystem.planetsCount +" planetas conocidos.");
        System.out.println("Al igual que la mayoría de los sistemas planetarios, tiene " + SolarSystem.starsCount + " estrella.");
        System.out.println("El nombre de la estrella es el "+ SolarSystem.starName + ".");
        System.out.println("La distancia al centro de la galaxia es de " + SolarSystem.distanceToGalacticCenter + " años luz.");
        System.out.println("¡Cada habitante del Sistema Solar debería conocer esta información!");
    }
}
