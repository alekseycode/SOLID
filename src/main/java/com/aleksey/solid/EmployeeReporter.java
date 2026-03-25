package com.aleksey.solid;

public class EmployeeReporter {

    public String getReport(Employee employee) {
        FulltimePayCalculator fulltimePayCalculator = new FulltimePayCalculator();

        return "Employee: " + employee.getName() + "\n" +
                " Hourly Rate: " + employee.getHourlyRate() + "/hr\n" +
                " Hours Worked: " + employee.getHoursWorked() + "\n" +
                " Total pay: " + fulltimePayCalculator.calculatePay(employee);
    }
}
