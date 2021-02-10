package com.thinkitive.db;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

import com.thinkitive.Student;
import com.thinkitive.Teacher;

public class DbTeacher {
	
	Configuration config;
	SessionFactory factory;
	Session session;
	Transaction tx;
	List al;
	DbStudent dbstud=new DbStudent();

			public void connect() {
				config = new Configuration();
				config.addAnnotatedClass(Teacher.class);
				factory = config.configure().buildSessionFactory();
				
		
				session = factory.openSession();
				tx = session.beginTransaction();
			}

			
			public void addTeachStudent(Student st)
			{
				dbstud.addStudent(st);
			}
	
			public void addTeach(Teacher t) {
				
				connect();
				session = factory.openSession();
				tx = session.beginTransaction();
				session.save(t);
				tx.commit();
				
				session.close();
				
				
			}


			public List displayTeacher() {
				connect();
				session = factory.openSession();
				tx = session.beginTransaction();
				List l;
				Query q = session.createQuery("from Teacher");
				l = q.list();
				
				return l;
			}
			
			public List loginTeacher(String name, String password)
			{
				connect();
				
				
				session = factory.openSession();
				tx = session.beginTransaction();
				Criteria criteria=session.createCriteria(Teacher.class);

				Restrictions.eq("name", name);
				Restrictions.eq("password", password);
				
				LogicalExpression andexp=Restrictions.and(Restrictions.eq("name", name), Restrictions.eq("password", password) );
				
				criteria.add(andexp);
				
				
				al=criteria.list();
				System.out.println(al);
				
				return al;
				
			}

				

}
