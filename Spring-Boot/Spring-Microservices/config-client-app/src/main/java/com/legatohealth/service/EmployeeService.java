package com.legatohealth.service;

import java.util.List;

import com.legatohealth.beans.Employee;
import com.legatohealth.exceptions.EmployeeNotFoundException;

public interface EmployeeService {
	
	public Employee saveEmp(Employee emp);
	
	public Employee fetchById(Integer userId) throws EmployeeNotFoundException;
	
	public List<Employee> fetchEmployee();

}
