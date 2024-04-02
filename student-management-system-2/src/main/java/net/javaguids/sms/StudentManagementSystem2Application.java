package net.javaguids.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguids.sms.entity.Student;
import net.javaguids.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystem2Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystem2Application.class, args);
	}

	@Autowired
	private StudentRepository studentrepository;
	@Override
	public void run(String... args) throws Exception {
		
		Student student1 = new Student("Ama","Prabu","ama@gmail.com"); 
		studentrepository.save(student1);
		
		Student student2 = new Student("Hansi","Wathsala","hansi@gmail.com"); 
		studentrepository.save(student2);
		
		Student student3 = new Student("Dhayn","Bhashitha","db@gmail.com"); 
		studentrepository.save(student3);
	}

}
