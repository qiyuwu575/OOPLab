package com.company.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.company.factory.EmployeeFactory;
import com.company.management.Employee;

/**
 * Test class for EmployeeFactory.
 */
public class EmployeeFactoryTest {

    private EmployeeFactory factory;

    @Before
    public void setUp() {
        factory = new EmployeeFactory();
    }

    @Test
    public void testCreateFullTimeEmployee() {
        Employee fullTimeEmployee = factory.createEmployee("full-time");
        
        assertNotNull(fullTimeEmployee);
        assertEquals("Alice", fullTimeEmployee.name);  // Assuming default value in EmployeeFactory
        assertEquals("IT", fullTimeEmployee.department);
        assertEquals("Manager", fullTimeEmployee.role);
        assertEquals(40, fullTimeEmployee.workingHoursPerWeek);
        assertEquals(80000, fullTimeEmployee.salary, 0);
    }

    @Test
    public void testCreatePartTimeEmployee() {
        Employee partTimeEmployee = factory.createEmployee("part-time");
        
        assertNotNull(partTimeEmployee);
        assertEquals("Bob", partTimeEmployee.name);  // Assuming default value in EmployeeFactory
        assertEquals("HR", partTimeEmployee.department);
        assertEquals("Assistant", partTimeEmployee.role);
        assertEquals(20, partTimeEmployee.workingHoursPerWeek);
        assertEquals(30000, partTimeEmployee.salary, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateUnknownEmployeeType() {
        factory.createEmployee("intern");  // This should throw an exception
    }
}
