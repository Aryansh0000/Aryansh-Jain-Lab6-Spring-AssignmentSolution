package com.gl.student.Lab5gl.repository;
import java.util.ArrayList;
import java.util.List;
import com.gl.student.Lab5gl.entity.Employee;

public class EmpRepository {

	public List<Employee> employee = new ArrayList<Employee>();
	public List<Employee> getAll() {
	return employee;}
	
	public String add(Employee emp) {
	employee.add(emp);
	return "sucessfully added";
	}
	public String edit(Employee emp) {
	employee.stream().filter(e-> e.getStudentId() == emp.getStudentId()).forEach(e->{
	e.setName(emp.getName()); 
	e.setDepartment(emp.getDepartment());
	e.setCountry(emp.getCountry());
	});
	return "updated"; 
	}


public String delete(int studentid) {
	employee.remove(studentid-1);
	return "delete";
}
}
