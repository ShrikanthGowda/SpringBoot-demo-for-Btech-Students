package com.example.userapplication.service;

import com.example.userapplication.exception.StudentException;
import com.example.userapplication.model.Student;
import com.example.userapplication.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

  @Autowired
  private StudentRepository studentRepository;


  public Student createStudent(Student student) {
    return studentRepository.save(student);
  }


  public Student updateStudent(Student student, Integer studentId) {
    Optional<Student> option = studentRepository.findById(studentId);
    if(!option.isPresent()) {
      throw new StudentException("Required Student details not found");
    }
    Student student1 = option.get();
    student1.setStudentName(student.getStudentName());
    student1.setCourseBranch(student.getCourseBranch());
    student1.setSemister(student.getSemister());
    return studentRepository.save(student1);
  }

  public void deleteStudent(Integer studentId) {
    Optional<Student> option = studentRepository.findById(studentId);
    if(!option.isPresent()) {
      throw new StudentException("Required Student details not found");
    }
    studentRepository.deleteById(studentId);
  }


  public Student getStudent(Integer studentId) {
    Optional<Student> option =  studentRepository.findById(studentId);
    if(!option.isPresent()) {
      throw new StudentException("Required Student details not found");
    }
    return option.get();
  }


  public List<Student> getAllStudents() {
    return studentRepository.findAll();
  }

}
