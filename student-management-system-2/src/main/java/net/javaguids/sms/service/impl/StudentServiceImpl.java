package net.javaguids.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguids.sms.entity.Student;
import net.javaguids.sms.repository.StudentRepository;
import net.javaguids.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student>getAllStudents(){
		
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudnet(Student student) {

		return studentRepository.save(student);
	}
	
	
}
