package student.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import student.student.model.Student;
import student.student.service.StudentService;



@RestController
@RequestMapping(value = "/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping(produces = "application/json")
	public ResponseEntity<List<Student>> getAllStudents()
	{
		List<Student> studList = studentService .getAllStudents();
		ResponseEntity<List<Student>> response =
				new ResponseEntity<List<Student>>(studList,HttpStatusCode.valueOf(200));
		return response;
	}
	
	@PostMapping(produces = "application/json")
	public ResponseEntity <Student> saveCourses( @RequestBody Student student)
	{
		Student cou =studentService.saveStudent(student);
		ResponseEntity <Student> response = 
		new ResponseEntity <Student>(cou,HttpStatusCode.valueOf(200));
		return response;
		    
	}
	@GetMapping(value = "/{id}",produces = "application/json")
	public ResponseEntity<Student> getCoursesById(@PathVariable("id")Integer id)
	{
		Student stud=studentService.getStudent(id);
		ResponseEntity<Student> response =
		new ResponseEntity<Student>(stud, HttpStatusCode.valueOf(200));
		return response;
		
	}
	
	@PutMapping(value = "/{id}",produces = "application/json")
	public ResponseEntity<Student> updateCourses(@PathVariable("id")Integer id,@RequestBody Student student)
	{
		Student stud=studentService.updateStudent(id, student);
		ResponseEntity<Student> response =
		new ResponseEntity<Student>(stud,HttpStatusCode.valueOf(200));
		return response;
		
	}
	
	@DeleteMapping(value = "/{id}", produces = "application/json")
	public ResponseEntity<String> deleteStudent(@PathVariable("id") Integer id)
	{
		boolean res = studentService.deleteStudent(id);
		String message;
		int status;
		if(res == true)
		{
		message = "student deleted!";
		status = 200;
		
		} else {
			message = "unable to delete!";
			status = 400;
		}
		ResponseEntity<String> response = 
				new ResponseEntity<String>(message, HttpStatusCode.valueOf(status));
		return response;
		
	}

	

}
