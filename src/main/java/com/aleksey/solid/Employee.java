package com.aleksey.solid;

public class Employee {
    private String name;
    private double hourlyRate;
    private double hoursWorked;

    public Employee(String name, double hourlyRate, double hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public String getName() { return name; }
    public double getHourlyRate() { return hourlyRate; }
    public double getHoursWorked() { return hoursWorked; }
}
