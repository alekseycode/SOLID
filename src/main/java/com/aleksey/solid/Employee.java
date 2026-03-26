package com.aleksey.solid;

public class Employee {
    protected String name;
    protected double hourlyRate;
    protected double hoursWorked;

    public Employee(String name, double hourlyRate, double hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public String getName() { return name; }
    public double getHourlyRate() { return hourlyRate; }
    public double getHoursWorked() { return hoursWorked; }

    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }

    public double calculateBonus() {
        return calculatePay() * 0.10;
    }
}
