package edu.sjsu.cmpe282.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

import edu.sjsu.cmpe282.model.TimeTable;
import edu.sjsu.cmpe282.repository.TimeTableRepository;

@Service
public class TimeTableService {
	
	@Autowired
	private TimeTableRepository timeTableRepository;
	
	public List<TimeTable> findAll() {
		return Lists.newArrayList(timeTableRepository.findAll());
	}
	
	public TimeTable findTimeTableByDate(String date) {
		return timeTableRepository.findOneByDate(date);
	}
	
	public TimeTable save(TimeTable TimeTable) {
		return timeTableRepository.save(TimeTable);
	}
	
	public void delete(TimeTable TimeTable) {
		timeTableRepository.delete(TimeTable);
	}

}
