package com.myapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "instructor_info")
public class InstructorInfo {
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "instructor_id")
	private int instructorId;
	
	@Column(name = "instructor_name")
	private String instructorName;
	
	@Column(name = "course_name")
	private String courseName;
	
	@Column(name = "instructor_experience")
	private int instructorExperience;

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getInstructorExperience() {
		return instructorExperience;
	}

	public void setInstructorExperience(int instructorExperience) {
		this.instructorExperience = instructorExperience;
	}

	@Override
	public String toString() {
		return "InstructorInfo [instructorId=" + instructorId + ", instructorName=" + instructorName + ", courseName="
				+ courseName + ", instructorExperience=" + instructorExperience + "]";
	}
	
	
}
