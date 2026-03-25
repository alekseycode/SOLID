package com.aleksey.solid;

public class EmployeeRepository {
    public String saveInfo(Employee employee) {
        return "Saving employee " + employee.getName() + "'s info to database...";
    }
}
