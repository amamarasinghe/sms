package net.javaguids.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguids.sms.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
 