package com.aleksey.solid;

public class EmployeeReporter implements Reportable {
    private PayCalculator payCalculator;
    private Bonusable bonusCalculator;

    public EmployeeReporter(PayCalculator payCalculator, Bonusable bonusCalculator) {
        this.payCalculator = payCalculator;
        this.bonusCalculator = bonusCalculator;
    }

    public String generateReport(HourlyEmployee employee) {
        return "Employee: " + employee.getName() + "\n"
                + "  Hourly pay: " + employee.getHourlyRate() + "\n"
                + "  Hours worked: " + employee.getHoursWorked() + "\n"
                + "  Total pay: " + payCalculator.calculatePay(employee) + "\n"
                + "  Bonus: " + bonusCalculator.calculateBonus();
    }
}
