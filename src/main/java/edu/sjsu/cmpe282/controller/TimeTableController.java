package edu.sjsu.cmpe282.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.sjsu.cmpe282.model.TimeTable;
import edu.sjsu.cmpe282.service.TimeTableService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="timetable")
public class TimeTableController {
	
	@Autowired
	TimeTableService timeTableService;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public TimeTable create(@RequestBody TimeTable timeTable) {
		
		
		return timeTableService.save(timeTable);
		
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<TimeTable> getAll() {
		return timeTableService.findAll();
	}
	
	@RequestMapping(value = "/{date}", method = RequestMethod.GET)
	public TimeTable getTimeTableByDate(@PathVariable String date) {
		return timeTableService.findTimeTableByDate(date);
	}
	
	@RequestMapping(value = "/{date}", method = RequestMethod.PUT)
	public TimeTable updateByDate(@PathVariable String date,
								  @RequestBody TimeTable timeTable) {
		TimeTable updatedTimeTable = timeTableService.findTimeTableByDate(date);
		if (timeTable.getTimesheet() != null) {
			updatedTimeTable.setTimesheet(timeTable.getTimesheet());
		}
		return timeTableService.save(updatedTimeTable);
	}
	
	@RequestMapping(value = "/{date}", method = RequestMethod.DELETE)
	public void deleteByDate(@PathVariable String date) {
		TimeTable timeTable = timeTableService.findTimeTableByDate(date);
		timeTableService.delete(timeTable);
	}
	
}
