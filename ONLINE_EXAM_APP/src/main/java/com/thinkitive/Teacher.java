package com.thinkitive;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Teacher")
public class Teacher {
	
	@Id
	private int id;
	private String name;
	private String exam;
	private String password;
	
	public Teacher() {
		
	}

	
	
	

	public Teacher(int id, String name, String exam, String password) {
		super();
		this.id = id;
		this.name = name;
		this.exam = exam;
		this.password = password;
	}





	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((exam == null) ? 0 : exam.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Teacher other = (Teacher) obj;
		if (exam == null) {
			if (other.exam != null)
				return false;
		} else if (!exam.equals(other.exam))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", exam=" + exam + "]";
	}
	
	
	
	
	

}
