package com.aleksey.solid;

public class ContractorPayCalculator implements PayCalculator {
    public double calculatePay(Employee employee) {
        return employee.getHourlyRate() * employee.getHoursWorked() * 0.85;
    }
}
