package es.codegym.task.pro.task13.task1322;

/* 
Los tipos de polígonos
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getShapeNameByCountOfCorners(3));
        System.out.println(getShapeNameByCountOfCorners(5));
        System.out.println(getShapeNameByCountOfCorners(1));
    }

    public static String getShapeNameByCountOfCorners(int cornerCount) {
        switch (cornerCount) {
            case 3:
                return "Triángulo";
            case 4:
                return "Cuadrilátero";
            case 5:
                return "Pentágono";
            case 6:
                return "Hexágono";
            case 7:
                return "Heptágono";
            case 8:
                return "Octágono";
            default:
                return "Otra forma";
        }
    }
}
