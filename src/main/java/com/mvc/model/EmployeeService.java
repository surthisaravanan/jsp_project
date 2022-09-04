package com.mvc.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.mvc.entity.Employee;

public class EmployeeService {
	public List<Employee> getEmployeelist()
	{
		List<Employee> employeeList =new ArrayList<>();
		Employee emp1 = new Employee(1, "Dhinesh", "S", "ECE", 25000, "Chrompet", "7676267676");
		Employee emp2 = new Employee(2,"surthi","s","EIE",25000,"mylapore","2345678123");
		Employee emp3 = new Employee(3,"darshita","v","ECE",25000,"adyar","2345123444");
		Employee emp4= new Employee(4,"thilaga","mc","EIE",25000,"tambaram","3456567123");
		Employee emp5 = new Employee(5,"snegavarshini","a","EIE",25000,"egmore","3456713245");
		Employee emp6= new Employee(6,"thathiksha","s","EIE",25000,"nemilicherri","3490076890");
		Employee emp7= new Employee(7,"yaameni","s","EIE",25000,"avadi","4500012455");
		Employee emp8 = new Employee(8,"nandhita","k","EIE",25000,"avadi","3451239765");
		employeeList.addAll(Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6,emp7,emp8));
	
		
		return employeeList;
		
		
		
		
	}
}
