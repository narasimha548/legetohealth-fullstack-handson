package com.legatohealth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.legatohealth.beans.CustomMessage;
import com.legatohealth.beans.Employee;
import com.legatohealth.config.DataSourceConfig;
import com.legatohealth.exceptions.EmployeeNotFoundException;
import com.legatohealth.service.EmployeeService;

@RestController
@RequestMapping("config")
public class ConfigController {

	@Autowired
	private DataSourceConfig config;

	@Autowired
	private EmployeeService empService;

	@GetMapping
	public ResponseEntity<Object> readConfigMessage() {
		// getMessage() returns the value the config file has
		return ResponseEntity.status(200).body("Db details ==> " + config.driverClass() + " username  "
				+ config.getUserName() + "   password " + config.getPassword());
	}

	@PostMapping("/save")
	public ResponseEntity<Object> saveEmp(@RequestBody Employee emp) {

		Employee saveEmp = empService.saveEmp(emp);

		return ResponseEntity.status(HttpStatus.OK).body(saveEmp);
	}

	@GetMapping("/fetch/{userId}")
	public ResponseEntity<Object> fetchById(@PathVariable Integer userId) {

		try {
			Employee employee = empService.fetchById(userId);
			return ResponseEntity.status(HttpStatus.OK).body(employee);
		} catch (EmployeeNotFoundException e) {
			CustomMessage custom = new CustomMessage(e.getMessage(), 404);
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(custom);
		}
	}
	
	@GetMapping("/fetchAll")
	public ResponseEntity<Object> fetchAll(){
		List<Employee> list = empService.fetchEmployee();
		
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}

}
