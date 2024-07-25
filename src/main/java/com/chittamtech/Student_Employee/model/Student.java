package com.chittamtech.Student_Employee.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.http.HttpStatus;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sid;
    private String sname;
    private String fname;
    private String gender;
    private String email;
    private long mobile;
    private String address;
    private String feeStatus;
    private String classname;


}
