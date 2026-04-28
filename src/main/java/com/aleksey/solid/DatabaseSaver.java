package com.aleksey.solid;

public class DatabaseSaver implements Persistable {
    public void saveToDataBase(HourlyEmployee employee) {
        System.out.println("Saving info for employee " + employee.getName() + " to database...");
    }
}
