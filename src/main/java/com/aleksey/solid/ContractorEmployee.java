package com.aleksey.solid;

public class ContractorEmployee implements Employee {
    private String name;
    private double hourlyRate;
    private double hoursWorked;

    public ContractorEmployee(String name, double hourlyRate, double hoursWorked) {
       this.name = name;
       this.hourlyRate = hourlyRate;
       this.hoursWorked = hoursWorked;
    }

    public double calculatePay() {
        return hourlyRate * hoursWorked * 0.85;
    }

    public String getName() {
        return name;
    }
}
