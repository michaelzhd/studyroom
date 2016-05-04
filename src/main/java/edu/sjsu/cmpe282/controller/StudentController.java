package edu.sjsu.cmpe282.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.sjsu.cmpe282.model.Student;
import edu.sjsu.cmpe282.service.StudentService;

@CrossOrigin(origins = "*")
@RequestMapping(value="student")
@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value = "", method=RequestMethod.POST)
	public Student create(@RequestBody Student student) {
		return studentService.save(student);
	}
	
	@RequestMapping(value = "", method=RequestMethod.GET)
	public List<Student> getAll(){
		return studentService.findAll();
	}
	
	@RequestMapping(value = "/{studentId}", method=RequestMethod.GET)
	public Student getStudentByStudentId(@PathVariable String studentId) {
		return studentService.findStudentByStudentId(studentId);
	}
	
	@RequestMapping(value = "/{studentId}", method=RequestMethod.PUT)
	public Student updateById(@PathVariable String studentId,
							@RequestBody Student student) {
		Student studentInDB = studentService.findStudentByStudentId(studentId);
		studentInDB.setStudentName(student.getStudentName());
		studentInDB.setReservation(student.getReservation());
								
		return studentService.save(studentInDB);
	}
	
	
	@RequestMapping(value = "/{studentId}", method=RequestMethod.DELETE)
	public void deleteById(@PathVariable String studentId) {
		Student student = studentService.findStudentByStudentId(studentId);
		if (student != null) {
			studentService.delete(student);
		}
	}

}
