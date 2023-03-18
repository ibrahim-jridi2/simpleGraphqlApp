package tn.soa.repository;

import java.util.ArrayList;
import java.util.List;

import tn.soa.entity.Student;

public class StudentRepository {
	private List<Student> students;

	public StudentRepository() {
		students=new ArrayList<Student>();
		students.add(new Student("2151564","test_esprit","test@test.com"));
		students.add(new Student("1315646846","test1","test1@test.com"));
		// TODO Auto-generated constructor stub
	}
	public List<Student> getAllStudents(){
		return students;
	}
	public void saveStudent(Student student) {
		students.add(student);
	}

}
