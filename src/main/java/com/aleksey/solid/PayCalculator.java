package com.aleksey.solid;

public class PayCalculator {
    public static double calculatePay(Employee employee) {
        return employee.getHourlyRate() * employee.getHoursWorked();
    }
}
