package com.aleksey.solid;

public class BonusCalculator implements Bonusable {
    private ContractorEmployee employee;

    public BonusCalculator(ContractorEmployee employee) {
        this.employee = employee;
    }

    public double calculateBonus() {
        return employee.calculatePay() * 0.10;
    }
}
