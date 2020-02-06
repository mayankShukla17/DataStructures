package com.techm;

public class Employee {
	private int empId;
	private String empName;
	private String dept;
	private Laptop laptop;
	public Employee(int empId,String empName) {
		this.empId=empId;
		this.empName=empName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dept=" + dept + ", laptop=" + laptop + "]";
	}
	
}
