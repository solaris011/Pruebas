package es.codegym.task.pro.task06.task0613;

/* 
Ciudades enormes
*/

public class Solution {
    public static String city = "Tokio";
    public static double population = 34.5;

    public static void main(String[] args) {
        printCityPopulation("Jakarta", 25.3);
        printCityPopulation("Seúl", 25.2);
        printCityPopulation("Delhi", 23.1);
        printCityPopulation("la Ciudad de Nueva York", 21.6);
    }

    public static void printCityPopulation(String city, double population) {
        System.out.println("La población de " + city + " es de " + population + " millones.");
        System.out.println("Pero en la ciudad más poblada, " + Solution.city + ", la población es de " + Solution.population + " millones.");
    }
}
