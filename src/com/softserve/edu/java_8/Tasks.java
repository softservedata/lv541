package com.softserve.edu.java_8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.*;

public class Tasks {
    public static void main(String[] args) {
        System.out.println("The first task");
        Random random = new Random();
        random.ints().limit(5).forEach(System.out::println);

        System.out.println("The second task");
        random.ints().limit(5).sorted().forEach(s -> System.out.println(s + " "));

        System.out.println("The third task");
        System.out.println(random.ints().limit(5).max().getAsInt());

        System.out.println("The fourth task");
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getDayOfWeek());

        System.out.println("Fifth task");
        LocalDate firstMondayOfCurrentMonth = LocalDate
                .now()
                .with(TemporalAdjusters.firstDayOfMonth())
                .with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        System.out.println(firstMondayOfCurrentMonth);

        System.out.println("Sixth task");
        List<String> strings = Arrays.asList("aaa", "uyrb", "iuthn", "iu", "12", "oiu");
        Collections.sort(strings, (a, b) -> a.length() - b.length());
        System.out.println(strings);
        }



    }




