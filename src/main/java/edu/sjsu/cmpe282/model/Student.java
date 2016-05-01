package edu.sjsu.cmpe282.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Student")
public class Student {
	
	@Id
	private String studentId;
	private String studentName;
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private StudentReservation reservation;
	public String getStudentId() {
		return studentId;
	}
//	@Override
//	public String toString() {
//		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", reservation=" + reservation
//				+ "]";
//	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public Student() {
	}
	public Student(String studentId, String studentName, StudentReservation reservation) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.reservation = reservation;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public StudentReservation getReservation() {
		return reservation;
	}
	public void setReservation(StudentReservation reservation) {
		this.reservation = reservation;
	}

}
