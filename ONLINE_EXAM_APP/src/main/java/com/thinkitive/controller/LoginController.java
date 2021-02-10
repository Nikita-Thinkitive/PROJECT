package com.thinkitive.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.thinkitive.db.DbAdmin;
import com.thinkitive.db.DbStudent;
import com.thinkitive.db.DbTeacher;

@RestController
public class LoginController {
	
	DbStudent stud=new DbStudent();
	DbTeacher teach=new DbTeacher();
	DbAdmin admin=new DbAdmin();
	
	@GetMapping(value="/studentLogin/{name,pass}")
	@ResponseBody
	public List studentlogin(@RequestParam String name, String pass)
	{
		List al=new ArrayList();
		al=stud.loginStudent(name, pass);
		System.out.println(al);
		return al;
	}
	
	@GetMapping(value="/teacherLogin/{name,pass}")
	@ResponseBody
	public List Teacherlogin(@RequestParam String name, String pass)
	{
		List al=new ArrayList();
		al=teach.loginTeacher(name, pass);
		System.out.println(al);
		return al;
	}
	
	
	@GetMapping(value="/adminLogin/{name,pass}")
	@ResponseBody
	public List Adminlogin(@RequestParam String name, String pass)
	{
		List al=new ArrayList();
		al=admin.adminLogin(name, pass);
		
		return al;
		
	}

}
