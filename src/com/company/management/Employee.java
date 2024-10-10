/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.management;

/**
 * Abstract class representing an Employee with common attributes and methods.
 */
public abstract class Employee {
     public int id;
     public String name;
     public String department;
     public String role;
     public int workingHoursPerWeek;
     public double salary;

    public Employee(int id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.role = role;
        this.workingHoursPerWeek = workingHoursPerWeek;
        this.salary = salary;
    }

    /**
     * Abstract method for clocking in.
     */
    public abstract void clockIn();

    /**
     * Abstract method for clocking out.
     */
    public abstract void clockOut();

    /**
     * Abstract method to track work hours.
     */
    public abstract void trackWorkHours();
}
