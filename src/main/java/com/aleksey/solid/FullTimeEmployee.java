package com.aleksey.solid;

public class FullTimeEmployee implements Employee, Bonusable, Reportable, Persistable {
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

    public double calculateTotalPay() {
        return calculatePay() + calculateBonus();
    }

    public String generateReport() {
        return "Employee: " + name + "\n"
                + "  Hourly pay: " + hourlyRate + "\n"
                + "  Hours worked: " + hoursWorked + "\n"
                + "  Bonus: " + calculateBonus() + "\n"
                + "  Total pay: " + calculateTotalPay();
    }

    public void saveToDataBase() {
        System.out.println("Saving employee " + name + " to database...");
        System.out.println("Employee " + name + " successfully saved to database.");
    }

    public String getName() {
        return name;
    }
}
