package com.thinkitive;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	
	@Id
	private int rollno;
	
	private String name;
	
	private int marks;
	
	private String exam;
	
	private String password;
	
	/*@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="qid")
	@OrderColumn(name="exam")
	
	private List<Exam> question;
	*/
	public Student() {
		
	}

		
	

	
	



	public Student(int rollno, String name, int marks, String exam, String password) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		this.exam = exam;
		this.password = password;
	}









	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getExam() {
		return exam;
	}

	public void setExam(String exam) {
		this.exam = exam;
	}

	
	public String getPassword() {
		return password;
	}









	public void setPassword(String password) {
		this.password = password;
	}









	@Override
	public String toString() {
		return " student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", exam=" + exam + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollno;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (rollno != other.rollno)
			return false;
		return true;
	}
	
	
	

}
