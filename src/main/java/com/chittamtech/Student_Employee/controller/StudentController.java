package com.chittamtech.Student_Employee.controller;

import com.chittamtech.Student_Employee.Exception.StudentNotFoundException;
import com.chittamtech.Student_Employee.model.Student;
import com.chittamtech.Student_Employee.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    public String createStudent(@RequestBody Student student){
        return studentService.create(student);
    }

    @GetMapping("/allStudents")
    public List<Student> allStudents(){
        return studentService.students();
    }

    @DeleteMapping("/delete/{sid}")
    public String deleteStudent(@PathVariable int sid){
        return studentService.delete(sid);
    }

    @PutMapping("/updateEmail/{sid}")
    public String updateEmail(@RequestBody Student student, @PathVariable int sid ){
       return studentService.updateEmail(student,sid);

        //return ResponseEntity.ok(studentupdated);
    }

    @GetMapping("/getstudent/{sid}")
    public ResponseEntity<Student> onlyStudent(@PathVariable int sid){
        Optional<Student> optionalStudent= Optional.ofNullable(studentService.getStundent(sid));
        //this is code
        return ResponseEntity.ok(optionalStudent.get());
    }

}
