package com.aleksey.solid;

public class FullTimeEmployee implements HourlyEmployee{
    private String name;
    private double hourlyRate;
    private double hoursWorked;
    private String employeeType = "Fulltime";

    public FullTimeEmployee(String name, double hourlyRate, double hoursWorked) {
       this.name = name;
       this.hourlyRate = hourlyRate;
       this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return name;
    }
    public double getHourlyRate() {return hourlyRate;}
    public double getHoursWorked() {return hoursWorked;}
    public String getEmployeeType() {return employeeType;}
}
