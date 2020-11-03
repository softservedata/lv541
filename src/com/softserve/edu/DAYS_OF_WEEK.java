package com.softserve.edu;

public enum DAYS_OF_WEEK {
    DAY1("Monday", "Понеділок", "Montag"),
    DAY2("Tuesday", "Вівторок", "Dienstag"),
    DAY3("Wednesday", "Середа", "Mittwoch"),
    DAY4("Thursday", "Четвер", "Donnerstag"),
    DAY5("Friday", "П'ятниця", "Freitag"),
    DAY6("Saturday", "Субота", "Samstag"),
    DAT7("Sunday", "Неділя", "Sonntag");
    private String first;
    private String second;
    private String third;

    DAYS_OF_WEEK(String first, String second, String third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public String toString() {
        return "DAYS_OF_WEEK{" +
                "first='" + first + '\'' +
                ", second='" + second + '\'' +
                ", third='" + third + '\'' +
                "} " + super.toString();
    }
}
