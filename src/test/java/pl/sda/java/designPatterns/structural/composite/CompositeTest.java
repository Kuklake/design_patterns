package pl.sda.java.designPatterns.structural.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompositeTest {

    @Test
    void shouldCreateHeadWithFinancialsAndSales() {
        Department salesDepartment = new SalesDepartment(1, "Sales Department");
        Department financialDepartment = new FinancialDepartment(2, "Financial Department");
        HeadDepartment headDepartment = new HeadDepartment(3, " headDepartment");

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);

        String departmentNames = headDepartment.getDepartmentNames();
        System.out.println(departmentNames);

        assertEquals("SalesDepartment,FinancialDepartment", departmentNames);
    }
}