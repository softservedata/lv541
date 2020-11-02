package com.softserve.task3;

public enum DaysEng {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public static DaysEng getDay (int day) {
        if (day == 1) {
            return DaysEng.MONDAY;
        } else if (day == 2) {
            return DaysEng.TUESDAY;
        } else if (day ==3) {
            return DaysEng.WEDNESDAY;
        } else if (day == 4) {
            return DaysEng.THURSDAY;
        } else if (day ==5) {
            return DaysEng.FRIDAY;
        }else if (day == 6){
            return DaysEng.SATURDAY;
        } else {
            return DaysEng.SUNDAY;
        }
    }
}
