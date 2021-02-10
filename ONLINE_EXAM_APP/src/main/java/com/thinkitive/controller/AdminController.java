package com.thinkitive.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.thinkitive.Exam;
import com.thinkitive.Student;
import com.thinkitive.Teacher;
import com.thinkitive.db.DbAdmin;
import com.thinkitive.db.DbQuestion;
import com.thinkitive.db.DbTeacher;


@RestController
public class AdminController {
	
	DbAdmin dbadmin=new DbAdmin();
	DbTeacher dbteach=new DbTeacher();
	DbQuestion que=new DbQuestion();
	
		//ADDING FUNCTIONALITY OF ADMIN
	
		@PostMapping(value="/adminaddStudent")
		public Student addStudent (@RequestBody Student st)
		{
			System.out.println(st);
			dbadmin.addAdminStudent(st);
			return st;
		}
		
		
		@PostMapping(value="/adminaddTeacher")
		public Teacher addTeacher (@RequestBody Teacher t)
		{
			System.out.println(t);
			dbadmin.addAdminTeach(t);
			return t;
		}
		
		@PostMapping(value="/adminaddExam")
		public Exam addExam (@RequestBody Exam e)
		{
			System.out.println(e);
			dbadmin.addExam(e);
			return e;
		}
		
		
		//ALL DISPLAY FUNCTIONALITY VIA ADMIN
		
		
		@GetMapping(value="/alladmin")
		public List displayAdmin()
		{
			List al=new ArrayList();
			al=dbadmin.displayAdmin();
			System.out.println(al);
			return al;
		}
		
		@GetMapping(value="/alladminStudent")
		public List displayAdminStudent()
		{
			List al=new ArrayList();
			al=dbadmin.displayAdminStudent();
			System.out.println(al);
			return al;
		}
		
		@GetMapping( value="/alladminTeacher")
		public List displayAdminTeacher()
		{
			List al=new ArrayList();
			al=dbteach.displayTeacher();
			System.out.println(al);
			return al;
		}
		
		
		@GetMapping(value="/alladminExam")
		public List displayAdminExam()
		{
			List al=new ArrayList();
			al=dbadmin.displayQuestions();
			System.out.println(al);
			return al;
		}
		
		//QUESTION OPERATION VIA ADMIN
		
		@GetMapping(value ="/adminQuestions/exam" )
		@ResponseBody
		public List displayQuestion(@RequestParam String exam)
		{
			List al=new ArrayList();
			al=que.displayQuestion(exam);
			
			System.out.println(al);
			return al;
		}
		
		@PostMapping(value ="/adminQuestions/exam" )
		public List displayQuest(@RequestBody String exam)
		{
			List al=new ArrayList();
			al=que.displayQuestion(exam);
			
			System.out.println(al);
			return al;
		}

}
