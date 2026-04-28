package com.aleksey.solid;

public class FulltimePayCalculator implements PayCalculator{
    public double calculatePay(HourlyEmployee employee) {
        return employee.getHoursWorked() * employee.getHourlyRate();
    }
}
