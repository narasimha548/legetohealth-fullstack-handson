package com.employeefactory;

import com.employee.EmployeeStorageImpl;
import com.employee.IEmployeeStorage;

public class EmployeeStorageFacotry {
	
	
	public static IEmployeeStorage getInstance() {
		return new EmployeeStorageImpl();
	}

}
