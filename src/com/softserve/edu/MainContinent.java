package com.softserve.edu;

import java.util.Scanner;

public class MainContinent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextLine()) {
            case "Ukraine": case "Italy": case "Germany":
                System.out.println("The name of the continent is " + CONTINENT.EUROPE);
                break;
            case "Libya": case "Malawi": case "Angola":
                System.out.println("The name of the continent is " + CONTINENT.AFRICA);
                break;
            case "China": case "Indonesia": case "Thailand":
                System.out.println("The name of the continent is " + CONTINENT.ASIA);
                break;
            default:
                System.out.println("Enter error");
                System.exit(0);
        }
    }
}
