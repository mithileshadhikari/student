package student.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import student.student.dao.StudentDao;
import student.student.model.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	 StudentDao studentDao;
	
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentDao.findAll();
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		Optional<Student>studOp = studentDao.findById(id);
		return studOp.get();
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.save(student);
	}

	@Override
	public Student updateStudent(int id, Student student) {
		// TODO Auto-generated method stub
		Optional<Student>studOp = studentDao.findById(student.getStudentid());
		Student studFromDB = studOp.get();
        
        studFromDB.setName(student.getName());
        studFromDB.setFeesAmt(student.getFeesAmt());
        studFromDB.setMarks(student.getMarks());
        studFromDB.setAddress(student.getAddress());
        studFromDB.setNumber(student.getNumber());
        
        Student savedc = studentDao.save(studFromDB);
		return savedc;
	}

	@Override
	public boolean deleteStudent(int id) {
		// TODO Auto-generated method stub
		Optional<Student>studOp = studentDao.findById(id);
		if (studOp.isPresent()) {
			studentDao.delete(studOp.get());
			return true;
		}

		return false;
	}
	
	
	

}
