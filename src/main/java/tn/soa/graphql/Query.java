package tn.soa.graphql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import tn.soa.entity.Student;
import tn.soa.repository.StudentRepository;

public class Query implements GraphQLRootResolver {
	private StudentRepository studentRepository;
	public Query(StudentRepository studentRepository) {
		this.studentRepository=studentRepository;
	}
	public List<Student> allStudents(){
		return studentRepository.getAllStudents();
	}
	

}
