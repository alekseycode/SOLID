package com.aleksey.solid;

public class BonusCalculator implements Bonusable {
    private FullTimeEmployee employee;
    private PayCalculator payCalculator;

    public BonusCalculator(FullTimeEmployee employee, PayCalculator payCalculator) {
        this.employee = employee;
        this.payCalculator = payCalculator;
    }

    public double calculateBonus() {
        return payCalculator.calculatePay(employee) * 0.10;
    }
}
