package com.softserve.homework04;

import java.util.Scanner;

public class Appl {
    public static String updateName(String name) {
        if (name.length()<4) {
            name = name.toUpperCase();
        } else {
            name = name.substring(0, 1).toUpperCase() 
                    + name.substring(1).toLowerCase();
            if (name.contains("_")) {
                int position = name.indexOf("_");
                name = name.substring(0, position + 1) 
                        + name.substring(position + 1, position + 2).toUpperCase() 
                        + name.substring(position + 2).toLowerCase();
            }
        }
        return name;
    }
    
    public static Continents getContinent(String country) {
        Continents result = null;
        country = updateName(country);
        switch (country) {
        case "Ukraine":
        case "Germany":
        case "France":
            result = Continents.EUROPA;
            break;
        case "USA":
            result = Continents.NORTH_AMERICA;
            break;
        case "Brasil":
        case "Argentina":
            result = Continents.SOUTH_AMERICA;
            break;
        case "Nigeria":
        case "Kongo":
        case "Kamerun":
            result = Continents.AFRICA;
            break;
        case "Australia":
            result = Continents.AUSTRALIA;
            break;
        default:
            System.out.println("Wrong!");
            throw new IllegalArgumentException("Invalid parameter: " + country);
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("country = ");
        String country = sc.nextLine();
        System.out.println("Continent is: " + updateName(getContinent(country).name()));
        sc.close();
    }
}
