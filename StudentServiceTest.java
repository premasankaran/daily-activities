package com.library.testserviceimpl;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.library.entity.Student;
import com.library.repository.StudentRepository;
import com.library.service.StudentService;
import com.library.util.StudentConverter;

@SpringBootTest
public class StudentServiceTest {
	
	
	@Autowired
	private StudentService studentService;
	
	@MockBean
	private StudentRepository studentRepository;
    
    @Test
    public void testSaveStudent() {
    	Student student=new Student(null, null, 0, null, 0);
    	student.setStudent("raja");
    	student.setPhone(5050685);
    	student.setEmail("raja@123");
    	student.setBranch("cse");
    	student.setYear(2022);
    	
    	Mockito.when(studentRepository.save(student)).thenReturn(student);
    	assertThat(studentService.addStudent(student)).isEqualTo("Student details saved successfully");
    	
    }
    
    @Test
    public void getAllStudentsTest() {
    	List<Student> student=studentRepository.findAll();
    	
    	assertThat(student.size()).isEqualTo(0);
    }

}
