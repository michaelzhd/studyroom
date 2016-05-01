package edu.sjsu.cmpe282.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "TimeTable")
public class TimeTable {
	
	public TimeTable() {
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public List<RoomReservation> getTimesheet() {
		return timesheet;
	}


	public void setTimesheet(List<RoomReservation> timesheet) {
		this.timesheet = timesheet;
	}


	public TimeTable(String date, List<RoomReservation> timesheet) {
		super();
		this.date = date;
		this.timesheet = timesheet;
	}


	@Id
	private String date;
	private List<RoomReservation> timesheet;

}
