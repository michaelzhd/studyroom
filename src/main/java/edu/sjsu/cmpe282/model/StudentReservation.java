package edu.sjsu.cmpe282.model;



public class StudentReservation {

	private String date;
	private String room;
	private String timeslot;
	@Override
	public String toString() {
		return "Reservation [date=" + date + ", room=" + room + ", timeslot=" + timeslot + "]";
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public StudentReservation() {
	}
	public StudentReservation(String date, String room, String timeslot) {
		super();
		this.date = date;
		this.room = room;
		this.timeslot = timeslot;
	}
	public String getTimeslot() {
		return timeslot;
	}
	public void setTimeslot(String timeslot) {
		this.timeslot = timeslot;
	}
}
