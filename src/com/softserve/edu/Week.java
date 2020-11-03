package com.softserve.edu;

public class Week {
    public static void main(String[] args) {
    DAYS_OF_WEEK day = DAYS_OF_WEEK.DAY1;
        System.out.println(day);
        System.out.println("");
        DAYS_OF_WEEK [] days = DAYS_OF_WEEK.values();
        for (DAYS_OF_WEEK daysOfWeek : days) {
            System.out.println(daysOfWeek);
        }
}
}
