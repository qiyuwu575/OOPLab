/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.company.builder;
import com.company.factory.PartTimeEmployee;
import com.company.management.Employee;

/**
 * Concrete builder for part-time employees.
 */
public class PartTimeEmployeeBuilder implements EmployeeBuilder {
    private int id;
    private String name;
    private String department;
    private String role;
    private int workingHoursPerWeek;
    private double salary;

    @Override
    public EmployeeBuilder setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public EmployeeBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    @Override
    public EmployeeBuilder setRole(String role) {
        this.role = role;
        return this;
    }

    @Override
    public EmployeeBuilder setWorkingHoursPerWeek(int workingHoursPerWeek) {
        this.workingHoursPerWeek = workingHoursPerWeek;
        return this;
    }

    @Override
    public EmployeeBuilder setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    @Override
    public Employee build() {
        return new PartTimeEmployee(id, name, department, role, workingHoursPerWeek, salary);
    }
}
