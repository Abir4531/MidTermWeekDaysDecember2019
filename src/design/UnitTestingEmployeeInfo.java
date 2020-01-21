package design;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class UnitTestingEmployeeInfo {

    private EmployeeInfo employeeInfo;

    @BeforeTest
    public void initTest() {

        employeeInfo = new EmployeeInfo();

        employeeInfo.setEmployeeName("Abir Hossain");
        employeeInfo.setEmployeeId(54321);
        employeeInfo.assignDepartment("QA Tester");
        EmployeeInfo.setCompanyName("Apple");
        employeeInfo.setEmployeeSalary(145000);
    }

    @Test
    public void testEmployeeName() {

        System.out.println("Testing employeeName()");
        assertEquals("Abir Hossain", employeeInfo.employeeName());
    }

    @Test
    public void testEmployeeId() {

        System.out.println("Testing employeeId()");
        assertEquals(54321, employeeInfo.employeeId());
    }

    @Test
    public void testEmployeeDepartment() {

        System.out.println("Testing getEmployeeDepartment()");
        assertEquals("QA Tester", employeeInfo.getEmployeeDepartment());
    }

    @Test
    public void testCompanyName() {

        System.out.println("Testing setCompanyName()");
        assertEquals("Apple", employeeInfo.getCompanyName());
    }

    @Test
    public void testCalculateSalary() {

        System.out.println("Testing calculateSalary()");
        assertEquals(145000, employeeInfo.calculateSalary());
    }
}