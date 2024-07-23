package com.chittamtech.Student_Employee.Exception;

public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException(int id){
        super("Student not found with "+id);
    }
}
