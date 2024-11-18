package es.codegym.task.pro.task13.task1317;

/* 
Convirtiendo un enum en una clase
*/

public enum Month {

    JANUARY("January", 31),
    FEBRUARY("February", 28),
    MARCH("March", 31),
    APRIL("April", 30),
    MAY("May", 31),
    JUNE("June", 30),
    JULY("July", 31),
    AUGUST("August", 31),
    SEPTEMBER("September", 30),
    OCTOBER("October", 31),
    NOVEMBER("November", 30),
    DECEMBER("December", 31);


    /*
    private static final Month JANUARY = ("January", 31);
    private static final Month FEBRUARY = ("February", 28);
    private static final Month MARCH = ("March", 31);
    private static final Month APRIL = ("April", 30);
    private static final Month MAY = ("May", 31);
    private static final Month JUNE = ("June", 30);
    private static final Month JULY = ("July", 31);
    private static final Month AUGUST = ("August", 31);
    private static final Month SEPTEMBER = ("September", 30);
    private static final Month OCTOBER = ("October", 31);
    private static final Month NOVEMBER = ("November", 30);
    private static final Month DECEMBER = ("December", 31);
    */

    private String name;
    private int daysCount;

    Month(String name, int daysCount) {
        this.name = name;
        this.daysCount = daysCount;
    }

    public static Month[] getWinterMonths() {

        return new Month[]{DECEMBER, JANUARY, FEBRUARY};
    }

    public static Month[] getSummerMonths() {

        return new Month[]{JUNE, JULY, AUGUST};
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDaysCount() {
        return daysCount;
    }

    public void setDaysCount(int daysCount) {
        this.daysCount = daysCount;
    }

    @Override
    public String toString() {
        return name + "=" + daysCount + " days";
    }

    //private static final Month[] VALUES = {JANUARY, FEBRUARY, MARCH,
            //, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER,
            //NOVEMBER, DECEMBER};

    /*
    private Month(int value) {
        this.value = value;
    }

    public int ordinal() {
        return value;
    }
    */
    //public static Month[] values() {
        //return VALUES;
    //}


}