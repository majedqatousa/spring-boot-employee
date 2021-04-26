package com.example.Employee.repo.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Employee.model.Employee;
import com.example.Employee.repo.EmployeeRepo;
import com.example.Employee.repo.exption.UserNotFoundExption;
@Service
public class EmployeeService {
	private final EmployeeRepo employeeRepo;
	@Autowired
	public EmployeeService(EmployeeRepo employeeRepo) {
		this.employeeRepo = employeeRepo;
	}
	
	public Employee addEmployee(Employee employee) {
		employee.setEmployeeCode(UUID.randomUUID().toString());
		return employeeRepo.save(employee);
	}
	
	public List<Employee> findAllEmployees(){
		return employeeRepo.findAll();
	}
	public Long getNumOfEmployees() {
		return employeeRepo.count();
	}
	public Employee updateEmployee(Employee employee){
		return employeeRepo.save(employee);
	}
	
	public Employee findEmployeeById(Long id) {
		return employeeRepo.findEmployeeById(id).orElseThrow(() -> new UserNotFoundExption("User by id " + id + "was not found "));
	}
	public void deleteEmployee(Long id) {
		employeeRepo.deleteEmployeeById(id);
	}
}
