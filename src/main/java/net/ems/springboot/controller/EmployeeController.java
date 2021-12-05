package net.ems.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.ems.springboot.repository.EmployeeRepository;
import net.ems.springboot.model.Employee;

@RestController
@RequestMapping("/api/v1/")

public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	//get all employees
	@GetMapping("/employees")
	@CrossOrigin
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
}
