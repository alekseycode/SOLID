package com.aleksey.solid;

public class SalariedEmployee implements Employee {
    private String name;
    private double salary;

    public SalariedEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {return name;}
    public double getSalary() {return salary;}
}
