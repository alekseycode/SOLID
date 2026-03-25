package com.aleksey.solid;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        Employee Aleksey = new Employee("Aleksey", 30.00, 80);
        Employee Sultan  = new Employee("Sultan", 30.00, 90);
        Employee Tom = new Employee("Tom", 30.00, 40);

        FulltimePayCalculator fulltimePayCalculator = new FulltimePayCalculator();
        OvertimePayCalculator overtimePayCalculator = new OvertimePayCalculator();
        ContractorPayCalculator contractorPayCalculator = new ContractorPayCalculator();

        System.out.println("Aleksey's Pay: " + fulltimePayCalculator.calculatePay(Aleksey));
        System.out.println("Sultan's Pay: " + overtimePayCalculator.calculatePay(Sultan));
        System.out.println("Tom's Pay: " + contractorPayCalculator.calculatePay(Tom));
    }
}
