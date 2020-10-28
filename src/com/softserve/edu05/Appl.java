package com.softserve.edu05;

import java.util.Scanner;

/*-
enum Season {
    WINTER, SPRING, SUMMER, AUTUMN
}
*/
/*-
enum Season {
    WINTER("Winter"),
    SPRING("Spring"),
    SUMMER("Summer"),
    AUTUMN("Autumn");
    
    private String name;
    //
    private Season(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return " ***toString() = " + name;
    }
    
    public Season nextSeason() {
        if (this == Season.WINTER) {
            return SPRING;
        }
        if (this == Season.SPRING) {
            return SUMMER;
        }
        if (this == Season.SUMMER) {
            return Season.AUTUMN;
        }
        return Season.WINTER;
    }
}
*/
enum Season {
    WINTER("Winter") {
        public Season nextSeason() { return SPRING; }
    },
    SPRING("Spring") {
        public Season nextSeason() { return SUMMER; }
    },
    SUMMER("Summer") {
        public Season nextSeason() { return AUTUMN; }
    },
    AUTUMN("Autumn") {
        public Season nextSeason() { return WINTER; }
    };
    
    private String name;
    //
    private Season(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    public abstract Season nextSeason();
}


public class Appl {
    public static void main(String[] args) {
        /*-
        int t = 5, s = 4;
        String str1 = null;
//        if (t >= ++s) {
//            str1 = "yes";
//        } else {
//            str1 = "no";
//        }
        str1 = t >= ++s ? "yes" : "no";
        System.out.println("str1 = " + str1);
        */
        /*-
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you enjoy Java? (yes/no/maybe) = ");
        String input = sc.nextLine().toLowerCase();
        //
//        if ( (input.equals("yes")) || (input.equals("maybe")) ) {
//            System.out.println("Great!");
//        } else if (input.equals("no")) {
//            System.out.println("Too bad!");
//        } else {
//            System.out.println("unknown ???");
//        }
        //
        switch (input) {
        case "yes":
        case "maybe":
            System.out.println("Great!");
            break;
        case "no":
            System.out.println("Too bad!");
            break;
        default:
            System.out.println("Wrong!");
        }
        */
        /*-
        Season season;
        season = Season.WINTER;
        System.out.println("season = " + season.name());
        System.out.println("Next season = " + season.nextSeason().name());
        //
        String name = "Spring"; // "Spring1" ERROR
        season = Season.valueOf(name.toUpperCase());
        System.out.println("season.name() = " + season.name());
        System.out.println("Next season.name() = " + season.nextSeason().name());
        //
        for (Season current : Season.values()) {
            System.out.println("current = " + current); // current.toString()
        }
        */
        //
        Season season = null;
        String month = "Marth";
        switch (month) {
        case "Deñember":
        case "January":
        case "February":
            season = Season.WINTER;
            break;
        case "Marth":
        case "April":
        case "May":
            season = Season.SPRING;
            break;
        case "June":
        case "Jule":
        case "August":
            season = Season.SUMMER;
            break;
        case "September":
        case "October":
        case "November":
            season = Season.AUTUMN;
            break;
        default:
            System.out.println("No this month\n");
            throw new IllegalArgumentException("Error: Invalid Argument");
            //System.exit(0);
        }
        System.out.println("season = " + season.toString());
        System.out.println("Next season = " + season.nextSeason());
        //
        switch (season) {
        case WINTER:
            System.out.println("Deñember, January, February");
            break;
        case SPRING:
            System.out.println("Marth, April, May");
            break;
        case SUMMER:
            System.out.println("June, Jule, August");
            break;
        case AUTUMN:
            System.out.println("September, October, November");
            break;
        }
    }
}
