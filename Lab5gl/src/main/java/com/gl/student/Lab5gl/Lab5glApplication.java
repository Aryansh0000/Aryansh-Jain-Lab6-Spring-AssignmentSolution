package com.gl.student.Lab5gl;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.gl.student.Lab5gl.entity.Employee;
import com.gl.student.Lab5gl.repository.EmpRepository;

@SpringBootApplication

public class Lab5glApplication implements CommandLineRunner{
	@Autowired
	EmpRepository empRepository;

	public static void main(String[] args) {
		SpringApplication.run(Lab5glApplication.class, args);
	 }
	@Override
	public void run(String...args) throws Exception {
		Employee e1=new Employee(1 ,"suresh","btech","india");
		Employee e2=new Employee(2,"murali", "btech", "canada");
		Employee e3=new Employee(3, "daniel", "btech", "new zealand");
		Employee e4=new Employee(4, "tanya", "btech","usa");
		empRepository.employee.addAll(Arrays.asList(e1,e2,e3,e4));
	}

}
