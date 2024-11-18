package es.codegym.task.pro.task12.task1209;

import java.util.ArrayList;
import java.util.Arrays;

/* 
<p>Departamento de contabilidad</p>
*/

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Doc");
        waitingEmployees.add("Grumpy");
        waitingEmployees.add("Happy");
        waitingEmployees.add("Sleepy");
        waitingEmployees.add("Bashful");
        waitingEmployees.add("Sneezy");
        waitingEmployees.add("Dopey");

        for (int i = 0; i < waitingEmployees.size(); i++) {
            paySalary(waitingEmployees.get(i));
        }

        System.out.println(alreadyGotSalaryEmployees);
        System.out.println(waitingEmployees);
    }

    public static void main(String[] args) {
        initEmployees();

    }

    public static void paySalary(String name) {
        if (waitingEmployees.contains(name) && !alreadyGotSalaryEmployees.contains(name)) {
            alreadyGotSalaryEmployees.add(name);

            for (int i = 0; i < waitingEmployees.size(); i++) {
                if (waitingEmployees.get(i) != null && waitingEmployees.get(i).equals(name)) {
                    waitingEmployees.set(i, null);
                    break;
                }
            }
        }

        /*
        if (name != null) {
            boolean found = false;
            for (int i = 0; i < alreadyGotSalaryEmployees.size();i++) {
                if (name.equals(alreadyGotSalaryEmployees.get(i)))
                    found = true;
            }
            if (!found) {
                alreadyGotSalaryEmployees.add(name);
                int index = waitingEmployees.indexOf(name);
                waitingEmployees.set(index, null);
            }
        }
        */
    }
}
