package edu.sjsu.cmpe282.model;

public class TimeSlotReservation {

	private String timeSlot;
	private String studentId;
	public TimeSlotReservation(String timeSlot, String studentId) {
		super();
		this.timeSlot = timeSlot;
		this.studentId = studentId;
	}
	public TimeSlotReservation() {
	}
	public String getTimeSlot() {
		return timeSlot;
	}
	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
}
