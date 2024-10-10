/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.factory;
import com.company.management.Employee;


/**
 * Factory class to create different types of employees.
 */
public class EmployeeFactory {

    /**
     * Creates and returns an employee based on the provided type.
     *
     * @param type the type of employee ("full-time" or "part-time")
     * @return created Employee
     */
    public Employee createEmployee(String type) {
        switch (type.toLowerCase()) {
            case "full-time":
                return new FullTimeEmployee(1, "Alice", "IT", "Manager", 40, 80000);
            case "part-time":
                return new PartTimeEmployee(2, "Bob", "HR", "Assistant", 20, 30000);
            default:
                throw new IllegalArgumentException("Unknown employee type");
        }
    }
}
