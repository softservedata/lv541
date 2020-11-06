package com.softserve.homework05;

public class Car implements Comparable<Car> {
    private int yearModel;
    private String make;
    private int speed;

    public Car(int yearModel, String make, int speed) {
        this.yearModel = yearModel;
        this.make = make;
        this.speed = speed;
        //speed = 0;
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void accelerate() {
        speed += 5;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + yearModel;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Car other = (Car) obj;
        if (yearModel != other.yearModel)
            return false;
        return true;
    }

    @Override
    public int compareTo(Car car) {
        return getYearModel() - car.getYearModel();
    }

    @Override
    public String toString() {
        return "\nCar [yearModel=" + yearModel
                + ", make=" + make
                + ", speed=" + speed
                + "]";
    }
    
    
}
