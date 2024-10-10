/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.factory;
import com.company.management.Employee;

/**
 * Full-time employee class extending Employee.
 */
public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        super(id, name, department, role, workingHoursPerWeek, salary);
    }

    @Override
    public void clockIn() {
        System.out.println("Full-time"+name + " clocked in.");
    }

    @Override
    public void clockOut() {
        System.out.println("Full-time"+name + " clocked out.");
    }

    @Override
    public void trackWorkHours() {
        System.out.println("Full-time" + name + " is tracking work hours.");
    }
}

