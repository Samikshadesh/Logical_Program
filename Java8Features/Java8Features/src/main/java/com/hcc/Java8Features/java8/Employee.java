package com.hcc.Java8Features.java8;

public class Employee {
	int EmpId;
	int EmpSal;
	String EmpName;
	int EmpAge;
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public int getEmpSal() {
		return EmpSal;
	}
	public void setEmpSal(int empSal) {
		EmpSal = empSal;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public int getEmpAge() {
		return EmpAge;
	}
	public void setEmpAge(int empAge) {
		EmpAge = empAge;
	}
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpSal=" + EmpSal + ", EmpName=" + EmpName + ", EmpAge=" + EmpAge + "]";
	}
	public Employee(int empId, int empSal, String empName, int empAge) {
		super();
		EmpId = empId;
		EmpSal = empSal;
		EmpName = empName;
		EmpAge = empAge;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
