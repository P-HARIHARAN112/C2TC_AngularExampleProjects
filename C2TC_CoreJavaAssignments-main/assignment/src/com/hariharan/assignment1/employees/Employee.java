package com.mohankumar.assignment1.employees;

public class Employee {
	 private String name;
	    private int employeeId;
	    private double salary;

	    // Constructor
	    public Employee(String name, int employeeId, double salary) {
	        this.name = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	    }

	    // Getter and Setter methods for private attributes
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getEmployeeId() {
	        return employeeId;
	    }

	    protected void setEmployeeId(int employeeId) {  // protected example
	        this.employeeId = employeeId;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    // Method to display employee details
	    public void displayInfo() {
	        System.out.println("Employee Name: " + name + ", ID: " + employeeId + ", Salary: " + salary);

}
}
