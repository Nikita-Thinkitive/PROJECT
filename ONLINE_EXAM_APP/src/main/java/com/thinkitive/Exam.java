package com.thinkitive;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;



//@Entity
//@Table(name="Exam")
public class Exam {
	
	//@Id
	private int no;
	private String exam_name;
	
	private List<Question> question;
	
	/*private String exam;
	private String quest;
	private String option1,option2,option3,option4;
	private String ans;
	
	/*@OneToMany(cascade = CascadeType.ALL)  
	@JoinColumn(name="qid")  
	@OrderColumn(name="type")  
	private List<Question> question;
	*/
	
	public Exam()
	{
		
	}

	
	public Exam(int no, String exam_name, List<Question> question) {
		super();
		this.no = no;
		this.exam_name = exam_name;
		this.question = question;
	}


	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public List<Question> getQuestion() {
		return question;
	}

	public void setQuestion(List<Question> question) {
		this.question = question;
	}
	
	
	

	public String getExam_name() {
		return exam_name;
	}


	public void setExam_name(String exam_name) {
		this.exam_name = exam_name;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((exam_name == null) ? 0 : exam_name.hashCode());
		result = prime * result + no;
		result = prime * result + ((question == null) ? 0 : question.hashCode());
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
		Exam other = (Exam) obj;
		if (exam_name == null) {
			if (other.exam_name != null)
				return false;
		} else if (!exam_name.equals(other.exam_name))
			return false;
		if (no != other.no)
			return false;
		if (question == null) {
			if (other.question != null)
				return false;
		} else if (!question.equals(other.question))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Exam [no=" + no + ", exam_name=" + exam_name + ", question=" + question + "]";
	}

	

	


	

	

}
