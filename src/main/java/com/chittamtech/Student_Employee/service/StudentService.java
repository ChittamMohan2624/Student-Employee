package com.chittamtech.Student_Employee.service;

import com.chittamtech.Student_Employee.Exception.StudentNotFoundException;
import com.chittamtech.Student_Employee.model.Student;
import com.chittamtech.Student_Employee.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentService {

    @Autowired
    public StudentRepository studentRepository;

    public String create(Student student){
        studentRepository.save(student);

        return "Student details are created successfully.!!";
    }

    public List<Student> students(){
        return studentRepository.findAll();
    }

    public List<Student> sortedStudents(){

        return studentRepository.findAll(Sort.by(Sort.Direction.DESC, "sname"));
    }

    public String delete(int sid){
        studentRepository.deleteById(sid);

        return "Student is deleted successfully..!";
    }

    public String updateEmail(Student student,int sid){

        Optional<Student> optionalStudent= studentRepository.findById(sid);

        if(optionalStudent.isPresent()){

            Student oneStudent=optionalStudent.get();
            oneStudent.setEmail(student.getEmail());
            studentRepository.save(oneStudent);
            return "Student is updated successfully..!";
        }else{
            return "There is no such student id";
        }


    }

    public Student getStundent(int sid){

        Optional<Student> optionalStudent= studentRepository.findById(sid);

        if(optionalStudent.isPresent()){
            return optionalStudent.get();
        }else{
            return optionalStudent.orElseThrow(()-> new StudentNotFoundException(sid));
        }

    }

}
