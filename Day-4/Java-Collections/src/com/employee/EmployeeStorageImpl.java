package com.employee;

import java.util.ArrayList;
import java.util.List;

import com.bean.Employee;
import com.util.EmployeeNotFoundException;

public class EmployeeStorageImpl implements IEmployeeStorage {

	public List<Employee> lst =new ArrayList<Employee>();;

	@Override
	public int save(Employee emp) {
		
		System.out.println("list data:: "+lst);
		lst.add(emp);
		return emp.getId();
	}

	@Override
	public Employee findEmployee(int id) throws EmployeeNotFoundException {
         
		
		for(Employee emp:lst) {
			System.out.println(emp);
			if(emp.getId()==id)
				return emp;
		}
		
		return null;
	}

	@Override
	public Employee[] findEmployees() {
		
		return (Employee[]) lst.toArray();
	}


	@Override
	public void delete(int id) throws EmployeeNotFoundException {
		for(Employee emp:lst) {
			System.out.println(emp);
			if(emp.getId()==id)
				 lst.remove(id);
		}
		
	}

}