package com.aleksey.solid;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        Employee Aleksey = new Employee("Aleksey", 30.00, 80);
        PayCalculator payCalculator = new PayCalculator();

        System.out.println("Calculate employee pay: ");
        System.out.println(payCalculator.calculatePay(Aleksey));
    }
}
