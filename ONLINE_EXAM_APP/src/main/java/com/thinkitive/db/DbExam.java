package com.thinkitive.db;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.thinkitive.Exam;
import com.thinkitive.Question;
import com.thinkitive.Student;

public class DbExam {
	

	Configuration config;
	SessionFactory factory;
	Session session;
	Transaction tx;
	List al;

		public void connect() {
			config = new Configuration();
			
			factory = config.configure().buildSessionFactory();
			
	
			session = factory.openSession();
			tx = session.beginTransaction();
		}
	
		
		public void addExamt(Exam e) {
			connect();
			session = factory.openSession();
			tx = session.beginTransaction();
			session.save(e);
			tx.commit();
			
			session.close();
			factory.close();
		
		
	}
		
		public List displayExam() 
		{ 
			connect();
			
			session = factory.openSession();
			tx = session.beginTransaction();

			Query q = session.createQuery("from Exam");
			al = q.list();
			
			System.out.println(al);
			return al;
		  }

		
		public List displayQuestion()
		{
			connect();
			session = factory.openSession();
			tx = session.beginTransaction();
			
			Query q = session.createQuery("from Question Inner Join Exam where Question.exam_name=Exam.exam_name");
			al = q.list();
			

			return al;
		}
	
	
	
	
	
			
			/*
			 * Configuration config; SessionFactory factory; Session session; Transaction
			 * tx; List al;
			 * 
			 * public void connect() { config=new Configuration(); //
			 * config.addAnnotatedClass(Exam.class);
			 * factory=config.configure().buildSessionFactory();
			 * 
			 * session= factory.openSession(); tx= session.beginTransaction(); }
			 * 
			 * public void addQuestions(Exam e) {
			 * 
			 * connect(); session = factory.openSession(); tx = session.beginTransaction();
			 * session.save(e); tx.commit();
			 * 
			 * session.close();
			 * 
			 * }
			 * 
			 * public List displayQuestions() { connect(); session = factory.openSession();
			 * tx = session.beginTransaction();
			 * 
			 * Query q = session.createQuery("from Exam"); al = q.list();
			 * System.out.println(al); return al; }
			 */

}
