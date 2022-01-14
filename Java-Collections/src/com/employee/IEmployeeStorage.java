package com.employee;

import com.bean.Employee;
import com.util.EmployeeNotFoundException;

public interface IEmployeeStorage {

	public int save(Employee emp);
    public Employee findEmployee(int id) throws EmployeeNotFoundException;
    public Employee[] findEmployees();
    public void delete(int id)throws EmployeeNotFoundException;
}
