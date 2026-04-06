package com.aleksey.solid;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContractorEmployee Aleksey = new ContractorEmployee("Aleksey", 30.00, 80);
        FullTimeEmployee Sultan  = new FullTimeEmployee("Sultan", 30.00, 80);

        BonusCalculator alekseyBonusCalculator = new BonusCalculator(Aleksey);
        EmployeeReporter AlekseyReporter = new EmployeeReporter(Aleksey, alekseyBonusCalculator);

        System.out.println("Hello and welcome!");
        System.out.println("Would you like to see a list of employees? (Y/N)");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("y")) {
            System.out.println("Employees: ");
            System.out.println("1." + Aleksey.getName());
            System.out.println("2." + Sultan.getName());
            System.out.println();
            System.out.println("Employee Reports: ");
            System.out.println(AlekseyReporter.generateReport());
            System.out.println();
            System.out.println(Sultan.generateReport());
            System.out.println();
            System.out.println("Would you like to save employee info? (Y/N)");
            String input2 = scanner.nextLine();
            if (input2.equalsIgnoreCase("y")) {
                Sultan.saveToDataBase();
            }
        }
        System.out.println("Goodbye!");
    }
}
