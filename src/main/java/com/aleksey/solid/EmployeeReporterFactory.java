package com.aleksey.solid;

public class EmployeeReporterFactory {
    public EmployeeReporter createForContractor(ContractorEmployee employee) {
        PayCalculator payCalc = new ContractorPayCalculator();
        Bonusable noBonus = new NoBonus();
        return new EmployeeReporter(payCalc, noBonus);
    }

    public EmployeeReporter createForFullTime(FullTimeEmployee employee) {
        PayCalculator payCalc = new FulltimePayCalculator();
        Bonusable bonusCalc = new BonusCalculator(employee, payCalc);
        return new EmployeeReporter(payCalc, bonusCalc);
    }
}
