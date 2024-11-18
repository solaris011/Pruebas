package es.codegym.task.pro.task03.task0313;

public class Solution {
    public static String string1 = "Amigo";
    public static String string2 = string1;
    public static String string3 = new String(string1);

    public static void main(String[] args) {

        String same = "Las referencias a las cadenas son iguales";
        String different = "Las referencias a las cadenas son diferentes";
        if (string1 == string2)
            System.out.println(same);
        else
            System.out.println(different);
        if (string2 == string3)
            System.out.println(same);
        else
            System.out.println(different);
        if (string1 == string3)
            System.out.println(same);
        else
            System.out.println(different);
    }
}
