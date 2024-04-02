package net.javaguids.sms.service;

import java.util.List;

import net.javaguids.sms.entity.Student;

public interface StudentService {
	List<Student>getAllStudents();
	
	Student saveStudent(Student student);
	
	
	Student updateStudnet(Student student);

	

	Object getStudentById1(Long id);

	Object getStudentById(Long id); 
	
	 
}