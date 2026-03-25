package com.aleksey.solid;

public class FulltimePayCalculator implements PayCalculator{
    public double calculatePay(Employee employee) {
        return employee.getHourlyRate() * employee.getHoursWorked();
    }
}
