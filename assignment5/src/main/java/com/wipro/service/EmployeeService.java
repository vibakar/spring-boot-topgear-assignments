package com.wipro.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.wipro.model.Employee;

@Component
public class EmployeeService {
	private static int count = 0;
	private static Map<Integer, Employee> emp = new HashMap<Integer, Employee>();
	
	static {
		Employee e1 = new Employee("Vibakar", "vibakar@gmail.com", "Bangalore");
		Employee e2 = new Employee("Viba", "viba@gmail.com", "Bangalore");
		
		emp.put(++count, e1);
		emp.put(++count, e2);
	}
	
	public Map<Integer, Employee> getAllEmployees() {
		return emp;
	}
	
	public Employee getEmployeeById(int id) {
		return emp.get(id);
	}
	
	public int addEmployee(Employee e) {
		int id = ++count;
		emp.put(id, e);
		return id;
	}
	
	public Employee updateEmployee(int id, Employee e) {
		emp.put(id, e);
		return e;
	}
	
	public String deleteEmployee(int id) {
		emp.remove(id);
		return "Deleted";
	}
}
