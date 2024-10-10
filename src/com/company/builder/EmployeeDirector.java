/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.builder;
import com.company.management.Employee;

/**
 * Director class to construct Employee objects using EmployeeBuilder.
 */
public class EmployeeDirector {
    private EmployeeBuilder builder;

    public EmployeeDirector(EmployeeBuilder builder) {
        this.builder = builder;
    }

    /**
     * Constructs and returns an Employee.
     *
     * @return constructed Employee
     */
    public Employee construct() {
        return builder.setId(1)
                      .setName("John Doe")
                      .setDepartment("Engineering")
                      .setRole("Developer")
                      .setWorkingHoursPerWeek(40)
                      .setSalary(60000)
                      .build();
    }
}
