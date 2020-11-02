package com.softserve.task3;

enum DaysDeu {
    SONNTAG, MONTAG, DIENSTAG, MITTWOCH, DONNERSTAG, FREITAG, SAMSTAG;

    public static DaysDeu getDay (int day) {
        if (day == 1) {
            return DaysDeu.MONTAG;
        } else if (day == 2) {
            return DaysDeu.DIENSTAG;
        } else if (day ==3) {
            return DaysDeu.MITTWOCH;
        } else if (day == 4) {
            return DaysDeu.DONNERSTAG;
        } else if (day ==5) {
            return DaysDeu.FREITAG;
        }else if (day == 6){
            return DaysDeu.SAMSTAG;
        } else {
            return DaysDeu.SONNTAG;
        }
    }
}

