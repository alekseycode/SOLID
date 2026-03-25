package com.aleksey.solid;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        Employee Aleksey = new Employee("Aleksey", 30.00, 80);
        EmployeeReporter employeeReporter = new EmployeeReporter();
        EmployeeRepository employeeRepository = new EmployeeRepository();

        System.out.println("Full employee report: ");
        System.out.println(employeeReporter.getReport(Aleksey));
        System.out.println(employeeRepository.saveInfo(Aleksey));
    }
}
