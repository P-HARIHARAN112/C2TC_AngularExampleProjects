package com.mohankumar.assignment1.utilities;

import com.mohankumar.assignment1.employees.Employee;

public class EmployeeUtilities {
	 public void printEmployeeDetails(Employee emp) {
	        emp.displayInfo();
	    }

	    // Protected method - only accessible within the same package or subclasses
	    public void updateSalary(Employee emp, double newSalary) {
	        System.out.println("Updating salary for " + emp.getName());
	        emp.displayInfo();
	        emp.setSalary(newSalary);
	        System.out.println("Updated Salary: " + emp.getSalary());

}
}
