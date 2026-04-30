package com.aleksey.solid;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContractorEmployee Aleksey = new ContractorEmployee("Aleksey", 30.00, 80);
        FullTimeEmployee Sultan  = new FullTimeEmployee("Sultan", 30.00, 80);
        SalariedEmployee Ana = new SalariedEmployee("Ana", 66000.00);

        EmployeeReporterFactory employeeReporterFactory = new EmployeeReporterFactory();

        EmployeeReporter sultanReporter = employeeReporterFactory.createForFullTime(Sultan);
        EmployeeReporter alekseyReporter = employeeReporterFactory.createForContractor(Aleksey);

        DatabaseSaver databaseSaver = new DatabaseSaver();

        System.out.println("Hello and welcome!");
        System.out.println("Would you like to see a list of employees? (Y/N)");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("y")) {
            System.out.println("Employees: ");
            System.out.println("1." + Aleksey.getName());
            System.out.println("2." + Sultan.getName());
            System.out.println("3." + Ana.getName());
            System.out.println();
        }
        System.out.println("Would you like to see employee reports? (Y/N)");
        String input2 = scanner.nextLine();
        if (input2.equalsIgnoreCase("Y")) {
            System.out.println("Employee Reports: ");
            System.out.println(sultanReporter.generateReport(Sultan));
            System.out.println();
            System.out.println(alekseyReporter.generateReport(Aleksey));
            System.out.println();
            System.out.println("No report for Ana yet :(");
        }
        System.out.println("Would you like to save employee info? (Y/N)");
        String input3 = scanner.nextLine();
        if (input3.equalsIgnoreCase("y")) {
            databaseSaver.saveToDataBase(Sultan);
            databaseSaver.saveToDataBase(Aleksey);
        }
        System.out.println("Goodbye!");
    }
}
