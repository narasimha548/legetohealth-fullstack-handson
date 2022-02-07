package com.legatohealth.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.legatohealth.beans.Employee;
import com.legatohealth.exceptions.EmployeeNotFoundException;
import com.legatohealth.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public Employee saveEmp(Employee emp) {
		Employee employee = empRepo.save(emp);
		return employee;
	}

	@Override
	public Employee fetchById(Integer userId) throws EmployeeNotFoundException {

		Optional<Employee> optional = empRepo.findById(userId);

		if (optional.isPresent()) {
			return optional.get();
		} else {
			throw new EmployeeNotFoundException("Employee not Found with id : " + userId);
		}

	}

	@Override
	public List<Employee> fetchEmployee() {

		return empRepo.findAll();
	}

}
