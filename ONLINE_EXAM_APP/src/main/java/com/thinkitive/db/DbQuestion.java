package com.thinkitive.db;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.thinkitive.Exam;
import com.thinkitive.Question;

public class DbQuestion {
	

	Configuration config;
	SessionFactory factory;
	Session session;
	Transaction tx;
	Criteria criteria;
	List al;
	Question q=new Question();

		public void connect() {
			config = new Configuration();
			
			factory = config.configure().buildSessionFactory();
			
	
			session = factory.openSession();
			tx = session.beginTransaction();
		}
	
		
		public void addExam(Exam e) {
			connect();
			session = factory.openSession();
			tx = session.beginTransaction();
			session.save(e);
			tx.commit();
			
			session.close();
			factory.close();
		
		
	}
		
		public void addQuest(Question q) {
			connect();
			session = factory.openSession();
			tx = session.beginTransaction();
			session.save(q);
			tx.commit();
			
			session.close();
			factory.close();
		
		
	}
		
		public List displayExam() 
		{ 
			connect();
			
			session = factory.openSession();
			tx = session.beginTransaction();
			String str="select no,quest,option1,option2,option3,option4 from Question";
			
			Query q = session.createQuery(str);
			al = q.list();
			
			System.out.println(al);
			return al;
		  }
	
	public List displayQuestion(String exam_name)
	{
		connect();
		session = factory.openSession();
		tx = session.beginTransaction();
		
		
		/*String str="  select no,quest,option1,option2,option3,option4 from Question where exam_name= :exam_name";
		Query query=session.createQuery(str);
		query.setParameter("exam_name", exam_name);*/
		
		criteria=session.createCriteria(Question.class);

		criteria.add(Restrictions.eq("exam_name", exam_name));
		Query q = session.createQuery("from Question where exam_name =:exam_name");
		Question qq=new Question();
		qq.setExam_name("java");
		qq.getExam_name();
		al = criteria.list();
		//al=query.list();
		System.out.println(al);

		return al;
	}
	
	public void deleteQuestion(String quest)
	{
		connect();
		session = factory.openSession();
		tx = session.beginTransaction();
		session.delete(quest);
		tx.commit();
		session.close();
		
	}

	
}
