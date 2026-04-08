package com.aleksey.solid;

public class EmployeeReporter implements Reportable {
    private HourlyEmployee employee;
    private BonusCalculator bonusCalculator;

    public EmployeeReporter(HourlyEmployee employee, BonusCalculator bonusCalculator) {
        this.employee = employee;
        this.bonusCalculator = bonusCalculator;
    }

    public String generateReport() {
        return "Employee: " + employee.getName() + "\n"
                + "  Hourly pay: " + employee.getHourlyRate() + "\n"
                + "  Hours worked: " + employee.getHoursWorked() + "\n"
                + "  Total pay: " + employee.calculatePay() + "\n"
                + "  Bonus: " + bonusCalculator.calculateBonus();
    }
}
