package com.thinkitive.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.thinkitive.db.DbQuestion;

@RestController
public class QuestionController {
	
	DbQuestion dbque=new DbQuestion();
	
	
	@GetMapping(value ="/allQuestions/exam" )
	@ResponseBody
	public List displayQuestion(@RequestParam String exam)
	{
		List al=new ArrayList();
		al=dbque.displayQuestion(exam);
		
		System.out.println(al);
		return al;
	}

}
