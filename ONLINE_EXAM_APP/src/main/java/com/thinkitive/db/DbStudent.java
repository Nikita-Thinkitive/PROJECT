package com.thinkitive.db;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

import com.thinkitive.Exam;
import com.thinkitive.Question;
import com.thinkitive.Student;

public class DbStudent {

					Configuration config;
					SessionFactory factory;
					Session session;
					Transaction tx;
					List al;
					
					DbQuestion que=new DbQuestion();
				
					public void connect() {
						config = new Configuration();
						config.addAnnotatedClass(Student.class);
						factory = config.configure().buildSessionFactory();
						
				
						session = factory.openSession();
						tx = session.beginTransaction();
					}
				
					
					public void addStudent(Student st) {
						connect();
						session = factory.openSession();
						tx = session.beginTransaction();
						session.save(st);
						tx.commit();
						
						session.close();
						factory.close();
						
						
					}
					
									
					public List displayStudent() {
						connect();
						session = factory.openSession();
						tx = session.beginTransaction();
				
						Query q = session.createQuery("from Student");
						al = q.list();
						System.out.println(al);
						return al;
					}
					
					
					public List addExam(String exam) 
					{
						
						config = new Configuration();
						//config.addAnnotatedClass(Question.class);
						factory = config.configure().buildSessionFactory();
						session = factory.openSession();
						tx = session.beginTransaction();
						
						//String q=" from Student Inner join Exam on Student.exam=Exam.exam";
							al=que.displayQuestion(exam);
							return al;
					}
					
					public List loginStudent(String name, String password)
					{
						connect();
						
						
						session = factory.openSession();
						tx = session.beginTransaction();
						Criteria criteria=session.createCriteria(Student.class);

						Restrictions.eq("name", name);
						Restrictions.eq("password", password);
						
						LogicalExpression andexp=Restrictions.and(Restrictions.eq("name", name), Restrictions.eq("password", password) );
						
						criteria.add(andexp);
						
						
						al=criteria.list();
						System.out.println(al);
						return al;
						
					}
	
}
