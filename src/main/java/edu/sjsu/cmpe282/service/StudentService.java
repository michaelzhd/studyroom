package edu.sjsu.cmpe282.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

import edu.sjsu.cmpe282.model.Student;
import edu.sjsu.cmpe282.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public List<Student> findAll() {
		return Lists.newArrayList(studentRepository.findAll());
	}
	
	public Student findStudentByStudentId(String studentId) {
		return studentRepository.findOneByStudentId(studentId);
	}
	
	public Student save(Student student) {
		return studentRepository.save(student);
	}
	
	public void delete(Student student) {
		studentRepository.delete(student);
	}

}
