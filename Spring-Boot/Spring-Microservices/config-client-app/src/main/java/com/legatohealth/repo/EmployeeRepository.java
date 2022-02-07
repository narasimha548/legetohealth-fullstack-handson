package com.legatohealth.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.legatohealth.beans.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
