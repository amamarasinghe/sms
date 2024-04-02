package net.javaguids.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import net.javaguids.sms.entity.Student;
import net.javaguids.sms.service.StudentService;

@Controller
public class StudentController {
	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	//handler method to handle list students and return mode and view
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
		
	}
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		//create student object to hold student from data
		Student student = new Student();
		model.addAttribute("student", student);
		return "create_student";
		
	}
	
	@PostMapping("/student")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/student";
	}	

	@GetMapping("/student/edit/{id}")
	public String editStudentForm(@PathVariable Long id,Model model) {
	model.addAttribute("student", studentService.getStudentById(id));
	return "edit_student";
		
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,
	@ModelAttribute("student") Student student,
	Model model) {

	// get student from database by id
	Student existingStudent = (Student) studentService.getStudentById(id);
	existingStudent.setFirstName(student.getFirstName());
	existingStudent.setLastName(student.getLastName());
	existingStudent.setEmail(student.getEmail());
	


	// save updated student object
	studentService.updateStudent(existingStudent);
	return "redirect:/students";



}
}
