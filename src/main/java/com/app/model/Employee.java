package com.app.model;

public class Employee {
	
	private int employeeId;
	private String employeePw;
	private String eFirst;
	private String eLast;
	private String email;
	
	public Employee() {
		
	}

	public Employee(int employeeId, String employeePw, String eFirst, String eLast, String email) {
		super();
		this.employeeId = employeeId;
		this.employeePw = employeePw;
		this.eFirst = eFirst;
		this.eLast = eLast;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeePw=" + employeePw + ", eFirst=" + eFirst + ", eLast="
				+ eLast + ", email=" + email + "]";
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeePw() {
		return employeePw;
	}

	public void setEmployeePw(String employeePw) {
		this.employeePw = employeePw;
	}

	public String geteFirst() {
		return eFirst;
	}

	public void seteFirst(String eFirst) {
		this.eFirst = eFirst;
	}

	public String geteLast() {
		return eLast;
	}

	public void seteLast(String eLast) {
		this.eLast = eLast;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
