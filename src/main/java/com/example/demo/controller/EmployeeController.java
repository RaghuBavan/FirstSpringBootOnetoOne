package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeReository;
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeReository employeerep;
	@PostMapping("/saveEmployees")
	public ResponseEntity<String> saveEmp(@RequestBody List<Employee> empData){
		employeerep.saveAll(empData);
		return ResponseEntity.ok("Data saved");
		
	}

}
