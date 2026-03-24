package com.aleksey.solid;

public class PayCalculator {
    public double calculatePay(Employee employee) {
        return employee.getHourlyRate() * employee.getHoursWorked();
    }
}
