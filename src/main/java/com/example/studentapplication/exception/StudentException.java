package com.example.studentapplication.exception;

public class StudentException extends RuntimeException {

  private String message;

  public StudentException(String message) {
    super(message);
  }
}
