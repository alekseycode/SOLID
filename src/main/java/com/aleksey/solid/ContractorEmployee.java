package com.aleksey.solid;

public class ContractorEmployee implements Employee, Reportable, Persistable {
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

    public String generateReport() {
        return "Employee: " + name + "\n"
                + "  Hourly pay: " + hourlyRate + "\n"
                + "  Hours worked: " + hoursWorked + "\n"
                + "  Total pay: " + calculatePay();
    }

    public void saveToDataBase() {
        System.out.println("Saving employee " + name + " to database...");
        System.out.println("Employee " + name + " successfully saved to database.");
    }

    public String getName() {
        return name;
    }
}
