package com.softserve.task3;

public enum DaysUkr {
    НЕДІЛЯ, ПОНЕДІЛОК, ВІВТОРОК, СЕРЕДА, ЧЕТВЕР, ПЯТНИЦЯ, СУБОТА;

    public static DaysUkr getDay (int day) {
        if (day == 1) {
            return DaysUkr.ПОНЕДІЛОК;
        } else if (day == 2) {
            return DaysUkr.ВІВТОРОК;
        } else if (day ==3) {
            return DaysUkr.СЕРЕДА;
        } else if (day == 4) {
            return DaysUkr.ЧЕТВЕР;
        } else if (day ==5) {
            return DaysUkr.ПЯТНИЦЯ;
        }else if (day == 6){
            return DaysUkr.СУБОТА;
        } else {
            return DaysUkr.НЕДІЛЯ;
        }
    }
}
