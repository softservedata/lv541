package com.softserve.hometask4;

public class Car {
    private String type;
    private int year;
    private int enginCapasity;

    public Car(String type, int year, int enginCapasity) {
        this.type = type;
        this.year = year;
        this.enginCapasity = enginCapasity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", year=" + year +
                ", enginCapasity=" + enginCapasity +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEnginCapasity() {
        return enginCapasity;
    }

    public void setEnginCapasity(int enginCapasity) {
        this.enginCapasity = enginCapasity;
    }
}
