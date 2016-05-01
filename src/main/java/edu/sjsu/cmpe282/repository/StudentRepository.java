package edu.sjsu.cmpe282.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import edu.sjsu.cmpe282.model.Student;

//@RepositoryRestResource(collectionResourceRel = "Student", path = "studyroom/Student")
public interface StudentRepository extends MongoRepository<Student, String> {
	Student findOneByStudentId(String studentId);
    List<Student> findAll();
    void delete(Student student);
    void deleteAll();

}
