package es.codegym.task.pro.task11.task1103;

/* 
presentación de robots
*/

public class Solution {
    public static void main(String[] args) {


        System.out.println("Presentation of robots manufactured by " + Robot.vendor);

        Robot robot1 = new Robot("RCV-322", 2019);
        robot1.displayInformation();

        Robot robot2 = new Robot("JavaTron-008", 2017);
        robot2.displayInformation();

        Robot robot3 = new Robot("BugDestroyer-007", 1998);
        robot3.displayInformation();

        Robot robot4 = new Robot("Gundam-14", 2004);
        robot4.displayInformation();

        Robot robot5 = new Robot("Eve-2", 2012);
        robot5.displayInformation();

        Robot moby = new Robot("Moby", 1995);
        moby.displayInformation();
        Robot walle = new Robot("Wall-E", 2000);
        walle.displayInformation();
        Robot eve = new Robot("EVE", 2135);
        eve.displayInformation();
        Robot c3po = new Robot("C-3PO", 1970);
        c3po.displayInformation();
        Robot r2d2 = new Robot("R2D2", 1972);
        r2d2.displayInformation();
    }
}
