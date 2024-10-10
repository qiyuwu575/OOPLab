/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.management;


import com.company.builder.FullTimeEmployeeBuilder;
import com.company.builder.PartTimeEmployeeBuilder;
import com.company.builder.EmployeeDirector;
import com.company.factory.EmployeeFactory;


/**
 * Main class to simulate the Employee Management System (EMS).
 */
public class EMS {

    public static void main(String[] args) {
        // Singleton pattern: Get the EmployeeManager instance
        EmployeeManager manager = EmployeeManager.getInstance();

        // Builder pattern: Create employees using builders
        FullTimeEmployeeBuilder fullTimeBuilder = new FullTimeEmployeeBuilder();
        PartTimeEmployeeBuilder partTimeBuilder = new PartTimeEmployeeBuilder();

        EmployeeDirector director = new EmployeeDirector(fullTimeBuilder);
        Employee fullTimeEmployee = director.construct();

        director = new EmployeeDirector(partTimeBuilder);
        Employee partTimeEmployee = director.construct();

        // Add employees to the manager
        manager.addEmployee(fullTimeEmployee);
        manager.addEmployee(partTimeEmployee);

        // Factory pattern: Create employees using the factory
        EmployeeFactory factory = new EmployeeFactory();
        Employee factoryFullTimeEmployee = factory.createEmployee("full-time");
        Employee factoryPartTimeEmployee = factory.createEmployee("part-time");

        // Add factory-created employees to the manager
        manager.addEmployee(factoryFullTimeEmployee);
        manager.addEmployee(factoryPartTimeEmployee);

        // Display all employees
        for (Employee employee : manager.getEmployees()) {
            System.out.println("Employee: " + employee.name + ", Role: " + employee.role);
        }
    }
}
