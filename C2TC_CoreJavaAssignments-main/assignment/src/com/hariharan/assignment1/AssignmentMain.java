package com.mohankumar.assignment1;

import com.mohankumar.assignment1.employees.Developer;
import com.mohankumar.assignment1.employees.Manager;
import com.mohankumar.assignment1.utilities.EmployeeUtilities;

public class AssignmentMain {

	public static void main(String[] args) {
		 Manager manager = new Manager("Mani", 202, 234517, "HR");
	        
	        // Creating Developer Objects
	        Developer developer = new Developer("Thiru", 207, 87888, "Java");

	        // Creating Utility Object
	        EmployeeUtilities util = new EmployeeUtilities();

	        // Display Details
	        util.printEmployeeDetails(manager);
	        util.printEmployeeDetails(developer);

	        // Update Salary Using Protected Method
	        util.updateSalary(manager, 345346);
	        util.updateSalary(developer, 120000);

	}

}
