package com.thinkitive.db;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import org.springframework.web.bind.annotation.RequestParam;

import com.thinkitive.Admin;
import com.thinkitive.Exam;

import com.thinkitive.Student;
import com.thinkitive.Teacher;

public class DbAdmin {
	
	Configuration config;
	SessionFactory factory;
	Session session;
	Transaction tx;
	List al;
	
	DbStudent dbstud=new DbStudent();
	DbTeacher dbteach=new DbTeacher();
	DbExam dbexam=new DbExam();

	public void connect() {
		config = new Configuration();
		config.addAnnotatedClass(Admin.class);
		factory = config.configure().buildSessionFactory();
		

		session = factory.openSession();
		tx = session.beginTransaction();
	}

			public void addAdmin(Admin ad) {
				
				connect();
				session = factory.openSession();
				tx = session.beginTransaction();
				session.save(ad);
				tx.commit();
				
				session.close();
				factory.close();
			}

	
			public List displayAdmin() {
				connect();
				session = factory.openSession();
				tx = session.beginTransaction();
		
				Query q = session.createQuery("from Admin");
				al = q.list();
				System.out.println(al);
				return al;
			}

			public void addAdminStudent(Student st) {
				connect();
				dbstud.addStudent(st);
				session.close();
				
				
			}

			public void addAdminTeach(Teacher t) {
				
				connect();
				dbteach.addTeach(t);
				
				session.close();
				
				
			}

			public void addExam(Exam e) {
				connect();
				dbexam.addExamt(e);
				session.close();
				

				
			}
			
			public List displayAdminStudent() {
				connect();
				List al=new ArrayList();
				al=dbstud.displayStudent();
				System.out.println(al);
				return al;
				
			}
			
			public List displayAdminTeacher() {
				connect();
				List al=new ArrayList();
				al=dbteach.displayTeacher();
				System.out.println(al);
				return al;
				
			}
			
			public List displayQuestions() 
			{
				connect();
				List al=new ArrayList();
				al=dbexam.displayExam();
				System.out.println(al);
				return al;
			}
			
			public List adminLogin(String name,String password)
			{
				connect();
				
				
				session = factory.openSession();
				tx = session.beginTransaction();
				Criteria criteria=session.createCriteria(Admin.class);

				Restrictions.eq("name", name);
				Restrictions.eq("password", password);
				
				LogicalExpression andexp=Restrictions.and(Restrictions.eq("name", name), Restrictions.eq("password", password) );
				
				criteria.add(andexp);
				
				
				al=criteria.list();
				System.out.println(al);
			/*	if(!al.isEmpty())
				{
					HttpSession session;
				}*/
				return al;
				
			}
	
	
	

}
