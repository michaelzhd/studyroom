package edu.sjsu.cmpe282.model;

import java.util.List;

public class RoomReservation {
	
	public RoomReservation() {
	}
	public RoomReservation(String roomNumber, List<TimeSlotReservation> timeSlots) {
		super();
		this.roomNumber = roomNumber;
		this.timeSlots = timeSlots;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public List<TimeSlotReservation> getTimeSlots() {
		return timeSlots;
	}
	public void setTimeSlots(List<TimeSlotReservation> timeSlots) {
		this.timeSlots = timeSlots;
	}
	private String roomNumber;
	private List<TimeSlotReservation> timeSlots;

}
