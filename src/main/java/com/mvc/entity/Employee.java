package com.mvc.entity;

public class Employee {
	private long id;
	private String Firstname;
	private String Lastname;
	private String Department;
	private double salary;
	private String address;
	private String mobileNo;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", Department="
				+ Department + ", salary=" + salary + ", address=" + address + ", mobileNo=" + mobileNo + "]";
	}
	public Employee(long id, String firstname, String lastname, String department, double salary, String address,
			String mobileNo) {
		super();
		this.id = id;
		Firstname = firstname;
		Lastname = lastname;
		Department = department;
		this.salary = salary;
		this.address = address;
		this.mobileNo = mobileNo;
	}
	
	

}
