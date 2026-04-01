package com.aleksey.solid;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        ContractorEmployee Aleksey = new ContractorEmployee("Aleksey", 30.00, 80);
        FullTimeEmployee Sultan  = new FullTimeEmployee("Sultan", 30.00, 80);

        System.out.println("Employee's Pay:");
        System.out.println("Sultan's Pay: " + Sultan.calculatePay());
        System.out.println("Aleksey's Pay: " + Aleksey.calculatePay());

        System.out.println("Bonuses:");
        // Sultan inherits Bonus method because only he can get a bonus
        System.out.println("Sultan's Bonus: " + Sultan.calculateBonus());
    }
}
