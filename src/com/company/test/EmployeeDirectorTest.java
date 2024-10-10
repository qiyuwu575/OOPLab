/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.test;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.company.builder.FullTimeEmployeeBuilder;
import com.company.builder.PartTimeEmployeeBuilder;
import com.company.builder.EmployeeDirector;
import com.company.management.Employee;

/**
 * Test class for EmployeeDirector.
 */
public class EmployeeDirectorTest {

    private FullTimeEmployeeBuilder fullTimeBuilder;
    private PartTimeEmployeeBuilder partTimeBuilder;
    private EmployeeDirector director;

    @Before
    public void setUp() {
        fullTimeBuilder = new FullTimeEmployeeBuilder();
        partTimeBuilder = new PartTimeEmployeeBuilder();
    }

    @Test
    public void testConstructFullTimeEmployee() {
        director = new EmployeeDirector(fullTimeBuilder);
        Employee fullTimeEmployee = director.construct();
        
        assertNotNull(fullTimeEmployee);
        assertEquals("John Doe", fullTimeEmployee.name);  // Assuming default value in EmployeeDirector
        assertEquals("Engineering", fullTimeEmployee.department);
        assertEquals(40, fullTimeEmployee.workingHoursPerWeek);
        assertEquals(60000, fullTimeEmployee.salary, 0);
    }

    @Test
    public void testConstructPartTimeEmployee() {
        director = new EmployeeDirector(partTimeBuilder);
        Employee partTimeEmployee = director.construct();
        
        assertNotNull(partTimeEmployee);
        assertEquals("John Doe", partTimeEmployee.name);  // Assuming default value in EmployeeDirector
        assertEquals("Engineering", partTimeEmployee.department);
        assertEquals(20, partTimeEmployee.workingHoursPerWeek);  // Adjust working hours accordingly
    }
}
