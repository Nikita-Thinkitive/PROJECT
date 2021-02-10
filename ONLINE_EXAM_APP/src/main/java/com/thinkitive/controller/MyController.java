package com.thinkitive.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thinkitive.db.DbAdmin;
import com.thinkitive.db.DbStudent;
import com.thinkitive.db.DbTeacher;
import com.thinkitive.Student;


@RestController
public class MyController {
	
	
	DbStudent dbstud=new DbStudent();
	DbTeacher dbteach=new DbTeacher();
	DbAdmin dbadmin=new DbAdmin();
	
	
	//STUDENTS FUNCTIONALITY
	@PostMapping(value="/addstudent")
	public Student Student (@RequestBody Student st)
	{
		System.out.println(st);
		dbadmin.addAdminStudent(st);
		return st;
	}

	@GetMapping(value="/allstudent")
	public List displayStudent()
	{
		List al=new ArrayList();
		al=dbstud.displayStudent();
	
		return al;
	}
	
	//TEACHER FUNCTIONALITY
	
	@GetMapping(value="/allteacher")
	public List displayTeacher()
	{
		List al=new ArrayList();
		al=dbteach.displayTeacher();
		
		return al;
	}
	
	
	
}
