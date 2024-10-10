package com.company.test;
import static org.junit.Assert.*;
import org.junit.Test;
import com.company.management.EmployeeManager;
import com.company.management.Employee;
import com.company.factory.FullTimeEmployee;

public class EmployeeManagerTest {

    @Test
    public void testSingletonInstance() {
        EmployeeManager manager1 = EmployeeManager.getInstance();
        EmployeeManager manager2 = EmployeeManager.getInstance();
        assertSame(manager1, manager2);
    }

    @Test
    public void testAddEmployee() {
        EmployeeManager manager = EmployeeManager.getInstance();
        Employee employee = new FullTimeEmployee(1, "John", "IT", "Developer", 40, 60000);
        manager.addEmployee(employee);
        assertEquals(1, manager.getEmployees().size());
    }
}
