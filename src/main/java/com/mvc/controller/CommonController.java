package com.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.entity.Employee;
import com.mvc.model.EmployeeService;

@WebServlet("/getEmployeeDetails")
public class CommonController extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		EmployeeService service= new EmployeeService();
		PrintWriter out=response.getWriter();
		//request.setAttribute("EmployeeDetails",service.getEmployeelist());
		service.getEmployeelist().stream().forEach(employee ->{
			out.println(employee.toString());
		});
	}
		
	}
	
	


