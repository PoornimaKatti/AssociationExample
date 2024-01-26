package com.java.AssociationExamples;
import java.util.Set;
import java.util.HashSet;
public class Association {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating objects of bank and Employee class
        Bank bank = new Bank("ICICI");
        Employee emp = new Employee("HDFC");

        Set<Employee> employees = new HashSet<>();
        employees.add(emp);

        bank.setEmployees(employees);

        System.out.println(emp.getEmployeeName()
                + " belongs to bank "
                + bank.getBankName());
    }
}
