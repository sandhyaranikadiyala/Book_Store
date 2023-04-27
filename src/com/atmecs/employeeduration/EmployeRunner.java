package com.atmecs.employeeduration;

import java.time.LocalDate;

/**
 * This program is for find the number of years the employee has been with the
 * company.
 * 
 * @author Sandhya.Kadiyala
 *
 */
public class EmployeRunner {

	/**
	 * This is main method to give the inputs and print the output.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		Employee employee = new Employee("Ram", 4000, LocalDate.of(2016, 4, 25));
		int years = employee.getExperienceInYears();
		System.out.println(years+" years.");
		// System.out.println(employee.getName() + " has been with the company for " +
		// employee.getExperienceInYears() + " years.");

	}

}
