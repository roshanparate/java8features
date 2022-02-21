package com.java.vo;

import java.util.Objects;

public class Employee {
	public int employeeNo;
	public String employeeName;
	public String designation;
	public double salary;
	public String city;

	public Employee(int employeeNo, String employeeName, String designation, double salary, String city) {
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}

	public int getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return String.format("(%d,%s,%s,%.2f,%s)",employeeNo,employeeName,designation,salary,city);
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, designation, employeeName, employeeNo, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(city, other.city) && Objects.equals(designation, other.designation)
				&& Objects.equals(employeeName, other.employeeName) && employeeNo == other.employeeNo
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
	
}
