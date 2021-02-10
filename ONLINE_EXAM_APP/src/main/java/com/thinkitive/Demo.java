package com.thinkitive;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.mapping.Array;

import com.thinkitive.db.DbAdmin;
import com.thinkitive.db.DbExam;
import com.thinkitive.db.DbQuestion;
import com.thinkitive.db.DbStudent;
import com.thinkitive.db.DbTeacher;

public class Demo {

	public static void main(String[] args) 
	{
		//DbExam e=new DbExam();
		//e.insert(new Question(1, null, null, null, null, null, null));
		
		DbQuestion d=new DbQuestion();
		Question q=new Question(2, null, null, null, null, null, null);
		Question q1=new Question(3, null, null, null, null, null, null);
		Question q2=new Question(4, null, null, null, null, null, null);
		List <Question> al=new ArrayList<Question>();
		
		q.setAns("java");
		String str=q.getExam_name();
		al=d.displayQuestion("java");
		System.out.println(al);
		
	}
}

// select * from Student Inner join Exam on Student.exam=Exam.exam;

