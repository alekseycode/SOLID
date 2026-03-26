package com.aleksey.solid;

public class ContractorEmployee extends Employee {
    public ContractorEmployee(String name, double hourlyRate, double hoursWorked) {
        super(name, hourlyRate, hoursWorked);
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked * 0.85;
    }

    @Override
    public double calculateBonus() {
        throw new UnsupportedOperationException("Contractors do not get bonuses. Sorry :/");
    }
}
