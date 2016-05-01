package edu.sjsu.cmpe282.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.sjsu.cmpe282.model.TimeTable;


public interface TimeTableRepository extends MongoRepository<TimeTable, String>{
	TimeTable findOneByDate(String date);
    List<TimeTable> findAll();
    void delete(TimeTable TimeTable);
    void deleteAll();
}
