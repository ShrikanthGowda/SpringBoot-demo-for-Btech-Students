package com.example.userapplication.controller;

import com.example.userapplication.model.Student;
import com.example.userapplication.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

  @Autowired
  private StudentService studentService;

  @PostMapping("/students")
  public ResponseEntity<Student> createStudent(@RequestBody Student student) {
    Student student1 = studentService.createStudent(student);
    return ResponseEntity.ok().body(student1);
  }


  @PutMapping("/students/{studentId}")
  public ResponseEntity<Student> updateStudent(@RequestBody Student student, @PathVariable Integer studentId) {
    Student student1 = studentService.updateStudent(student, studentId);
    return ResponseEntity.ok().body(student1);
  }

  @DeleteMapping("/students/{studentId}")
  public ResponseEntity deleteStudent(@PathVariable Integer studentId) {
    studentService.deleteStudent(studentId);
    return ResponseEntity.ok().build();
  }

  @GetMapping("/students/{studentId}")
  public Student getStudent(@PathVariable Integer studentId) {
    return studentService.getStudent(studentId);
  }

  @GetMapping("/students")
  public List<Student> getAllStudents() {
    List<Student> list = new ArrayList<>();
    list = studentService.getAllStudents();
    return list;
  }

}
