package com.thinkitive;

import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
//@Table(name="Questions")
public class Question {
	
	private int no;
	private String exam_name;
	private String quest;
	private String option1,option2,option3,option4;
	private String ans;
	
	public Question()
	{
		
	}
	
	public Question(String exam_name)
	{
		this.exam_name=exam_name;
	}
	
	public Question(int no, String quest, String option1, String option2, String option3, String option4, String ans) {
		super();
		this.no = no;
		this.quest = quest;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.ans = ans;
	}

	
	public Question(int no, String exam_name, String quest, String option1, String option2, String option3,
			String option4, String ans) {
		super();
		this.no = no;
		this.exam_name = exam_name;
		this.quest = quest;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.ans = ans;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getQuest() {
		return quest;
	}

	public void setQuest(String quest) {
		this.quest = quest;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	public String getExam_name() {
		return exam_name;
	}

	public void setExam_name(String exam_name) {
		this.exam_name = exam_name;
	}

	@Override
	public String toString() {
		return "Question [no=" + no + ", quest=" + quest + ", option1=" + option1 + ", option2=" + option2
				+ ", option3=" + option3 + ", option4=" + option4 +  "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ans == null) ? 0 : ans.hashCode());
		result = prime * result + ((exam_name == null) ? 0 : exam_name.hashCode());
		result = prime * result + no;
		result = prime * result + ((option1 == null) ? 0 : option1.hashCode());
		result = prime * result + ((option2 == null) ? 0 : option2.hashCode());
		result = prime * result + ((option3 == null) ? 0 : option3.hashCode());
		result = prime * result + ((option4 == null) ? 0 : option4.hashCode());
		result = prime * result + ((quest == null) ? 0 : quest.hashCode());
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
		Question other = (Question) obj;
		if (ans == null) {
			if (other.ans != null)
				return false;
		} else if (!ans.equals(other.ans))
			return false;
		if (exam_name == null) {
			if (other.exam_name != null)
				return false;
		} else if (!exam_name.equals(other.exam_name))
			return false;
		if (no != other.no)
			return false;
		if (option1 == null) {
			if (other.option1 != null)
				return false;
		} else if (!option1.equals(other.option1))
			return false;
		if (option2 == null) {
			if (other.option2 != null)
				return false;
		} else if (!option2.equals(other.option2))
			return false;
		if (option3 == null) {
			if (other.option3 != null)
				return false;
		} else if (!option3.equals(other.option3))
			return false;
		if (option4 == null) {
			if (other.option4 != null)
				return false;
		} else if (!option4.equals(other.option4))
			return false;
		if (quest == null) {
			if (other.quest != null)
				return false;
		} else if (!quest.equals(other.quest))
			return false;
		return true;
	}

	
	
	
	

}
