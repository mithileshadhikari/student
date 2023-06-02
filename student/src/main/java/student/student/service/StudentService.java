package student.student.service;

import java.util.List;


import student.student.model.Student;

public interface StudentService {

List<Student> getAllStudents();
	
	Student getStudent(int id);
	
	Student saveStudent(Student student);
	
	Student updateStudent(int id,Student student);
	
	boolean deleteStudent(int id);


}
