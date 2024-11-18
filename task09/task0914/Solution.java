package es.codegym.task.pro.task09.task0914;

/* 
Actualización de la ruta
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        String nuevo = path.replace("jdk1.8", jdk);
        //String nuevo = path.replaceFirst("jdk1.8", jdk);
        if (nuevo.isEmpty()) {
            return null;
        } else {
            return nuevo;
        }
    }
}
