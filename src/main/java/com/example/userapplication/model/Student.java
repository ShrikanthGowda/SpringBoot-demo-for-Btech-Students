package com.example.userapplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {

  @Id
  @GeneratedValue
  private Integer studentID;

  private String studentName;

  private Integer semister;

  @Column(name = "branch")
  private String courseBranch;

  public Student() {
  }

  public Integer getStudentID() {
    return studentID;
  }

  public void setStudentID(Integer studentID) {
    this.studentID = studentID;
  }

  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public Integer getSemister() {
    return semister;
  }

  public void setSemister(Integer semister) {
    this.semister = semister;
  }

  public String getCourseBranch() {
    return courseBranch;
  }

  public void setCourseBranch(String courseBranch) {
    this.courseBranch = courseBranch;
  }
}
