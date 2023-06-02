package student.student.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import student.student.model.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer>{

}
