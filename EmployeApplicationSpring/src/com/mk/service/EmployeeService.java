package com.mk.service;

import java.util.List;

import com.mk.model.Employee;

public interface EmployeeService {
	
	public void addEmployee(Employee employee);
	public List<Employee> listEmployeess();
	public Employee getEmployee(int empid);
	public void deleteEmployee(Employee employee);
}
