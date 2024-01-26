package com.java.AssociationExamples;
//Association is a relation between two separate classes which establishes through their Objects.
// Association can be one-to-one, one-to-many, many-to-one, many-to-many.

import java.io.*;
import java.util.*;
import java.util.Set;
public class Bank {
    // Attributes of bank
    private String name;

    private Set<Employee> employees;
    // Constructor of this class
    Bank(String name)
    {
        // this keyword refers to current instance itself
        this.name = name;
    }

    // Method of Bank class
    public String getBankName()
    {
        // Returning name of bank
        return this.name;
    }

    public void setEmployees(Set<Employee> employees)
    {
        this.employees = employees;
    }
    public Set<Employee>
    getEmployees(Set<Employee> employees)
    {
        return this.employees;
    }
}




