package com.gl.student.Lab5gl.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype. Service;
import com.gl.student.Lab5gl.entity.Employee;
import com.gl.student.Lab5gl.repository.EmpRepository;
@Service
public class EmpService{
@Autowired
EmpRepository empRepository;
public List<Employee> getAll()
{
return empRepository.getAll();
}
public String add(Employee emp) {
// TODO Auto-generated method stub
return empRepository.add(emp);
}
public String edit(Employee emp){
return empRepository.edit(emp);
}
public String studentid(int studentid) {
return empRepository.delete(studentid);
}
}