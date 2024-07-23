package com.chittamtech.Student_Employee.repository;

import com.chittamtech.Student_Employee.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository  extends JpaRepository<Student,Integer> {


}
