package es.codegym.task.pro.task14.task1414;

/* 
Cómo hacer cócteles
*/

public class Solution {

    public static final String OUTPUT_FORMAT = "El método %s fue llamado en la línea %d de la %s clase en el archivo %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
        for(StackTraceElement info: stackTrace)
            System.out.printf(OUTPUT_FORMAT, info.getMethodName(), info.getLineNumber(), info.getClassName(), info.getFileName());

    }

    static void makeScrewdriver() {
        addJuice();
    }

    static void addJuice() {
        addVodka();
    }

    static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}
