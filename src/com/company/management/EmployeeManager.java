/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.management;

import java.util.ArrayList;
import java.util.List;
/**
 * Singleton class that manages all employees in the system.
 */
public class EmployeeManager {
    private static EmployeeManager instance;
    private List<Employee> employees;

    private EmployeeManager() {
        employees = new ArrayList<>();
    }

    /**
     * Returns the single instance of EmployeeManager.
     *
     * @return EmployeeManager instance
     */
    public static EmployeeManager getInstance() {
        if (instance == null) {
            instance = new EmployeeManager();
        }
        return instance;
    }

    /**
     * Adds an employee to the system.
     *
     * @param employee the employee to add
     */
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    /**
     * Removes an employee from the system.
     *
     * @param employee the employee to remove
     */
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    /**
     * Retrieves a list of all employees.
     *
     * @return list of employees
     */
    public List<Employee> getEmployees() {
        return employees;
    }
}
