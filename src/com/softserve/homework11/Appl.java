package com.softserve.homework11;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Appl {
    public static void main(String[] args) {
        System.out.println("Fifth task");
        LocalDate firstMondayOfCurrentMonth = LocalDate
                .now()
                .with(TemporalAdjusters.firstDayOfMonth())
                .with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        System.out.println(firstMondayOfCurrentMonth);
    }
}
