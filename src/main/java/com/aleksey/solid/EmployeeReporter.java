package com.aleksey.solid;

public class EmployeeReporter {
    private PayCalculator payCalculator = new PayCalculator();

    public String getReport(Employee employee) {

        return "Employee: " + employee.getName() + "\n" +
                " Hourly Rate: " + employee.getHourlyRate() + "/hr\n" +
                " Hours Worked: " + employee.getHoursWorked() + "\n" +
                " Total pay: " + payCalculator.calculatePay(employee);
    }
}
