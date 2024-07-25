package com.chittamtech.Student_Employee.repository;

import com.chittamtech.Student_Employee.model.Student;
import org.hibernate.query.NativeQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository  extends JpaRepository<Student,Integer> {

   // @Query(value = "select s from student s WHERE s.sname=:sname")
   // List<Student> getBySname(@Param("sname") String sname);
    List<Student> findBySname(String sname);


}
