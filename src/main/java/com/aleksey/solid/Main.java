package com.aleksey.solid;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContractorEmployee Aleksey = new ContractorEmployee("Aleksey", 30.00, 80);
        FullTimeEmployee Sultan  = new FullTimeEmployee("Sultan", 30.00, 80);

        PayCalculator fullTimePayCalc = new FulltimePayCalculator();
        PayCalculator contractorPayCalc = new ContractorPayCalculator();

        BonusCalculator sultanBonusCalc = new BonusCalculator(Sultan, fullTimePayCalc);
        Bonusable noBonus = new NoBonus();

        EmployeeReporter sultanReporter = new EmployeeReporter(fullTimePayCalc, sultanBonusCalc);
        EmployeeReporter alekseyReporter = new EmployeeReporter(contractorPayCalc, noBonus);

        DatabaseSaver databaseSaver = new DatabaseSaver();

        System.out.println("Hello and welcome!");
        System.out.println("Would you like to see a list of employees? (Y/N)");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("y")) {
            System.out.println("Employees: ");
            System.out.println("1." + Aleksey.getName());
            System.out.println("2." + Sultan.getName());
            System.out.println();
            System.out.println("Employee Reports: ");
            System.out.println(sultanReporter.generateReport(Sultan));
            System.out.println();
            System.out.println(alekseyReporter.generateReport(Aleksey));
            System.out.println();
            System.out.println("Would you like to save employee info? (Y/N)");
            String input2 = scanner.nextLine();
            if (input2.equalsIgnoreCase("y")) {
                databaseSaver.saveToDataBase(Sultan);
                databaseSaver.saveToDataBase(Aleksey);
            }
        }
        System.out.println("Goodbye!");
    }
}
