package com.aleksey.solid;

public class FullTimeEmployee implements Employee, Bonusable {
    private String name;
    private double hourlyRate;
    private double hoursWorked;

    public FullTimeEmployee(String name, double hourlyRate, double hoursWorked) {
       this.name = name;
       this.hourlyRate = hourlyRate;
       this.hoursWorked = hoursWorked;
    }

    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

    public double calculateBonus() {
        return calculatePay() * 0.10;
    }

    public String getName() {
        return name;
    }
}
