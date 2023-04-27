package com.atmecs.employeeduration;

import java.time.LocalDate;
import java.time.Period;

/**
 * This program is for find the number of years the employee has been with the
 * company.
 * 
 * @author Sandhya.Kadiyala
 *
 */
public class Employee {
	String name;
	int salary;
	LocalDate hireDate;

	/**
	 * This is Employee constructor which sets the name,salary,hireDate.
	 * 
	 * @param name
	 * @param salary
	 * @param hireDate
	 */
	public Employee(String name, int salary, LocalDate hireDate) {
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
	}

	/**
	 * Using period.between() get the difference between hire date and current date.
	 * 
	 * @return
	 */
	public int getExperienceInYears() {
		LocalDate currentDate = LocalDate.now();
		Period period = Period.between(hireDate, currentDate);
		return period.getYears();
	}
}
