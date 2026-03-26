package com.aleksey.solid;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        Employee Aleksey = new ContractorEmployee("Aleksey", 30.00, 80);
        Employee Sultan  = new FullTimeEmployee("Sultan", 30.00, 90);
        Employee Tom = new Employee("Tom", 30.00, 40);

        System.out.println("Employee's Pay:");
        System.out.println("Sultan's Pay: " + Sultan.calculatePay());
        System.out.println("Aleksey's Pay: " + Aleksey.calculatePay());

        System.out.println("Bonuses:");
        System.out.println("Sultan's Bonus: " + Sultan.calculateBonus());
        System.out.println("Aleksey's Bonus: " + Aleksey.calculateBonus());
    }
}
