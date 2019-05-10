package com.example.springboot2.service;

import com.example.springboot2.repository.StudentAddressRepository;
import com.example.springboot2.repository.StudentRepository;
import com.example.springboot2.model.Student;
import com.example.springboot2.model.StudentAddress;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {

  private static final Logger logger = LoggerFactory.getLogger(StudentService.class);

  @Autowired
  StudentRepository studentRepository;

  @Autowired
  StudentAddressRepository studentAddressRepository;

  @Transactional
  public void save() {

    studentRepository.deleteAll();

    logger.info(" *** StudentService - Save()  ***");

    StudentAddress studentAddress = null;
    if (studentAddressRepository.findByAddressDetailContaining("KL, Malaysia").size() == 0) { //not found
      studentAddress = new StudentAddress();
      studentAddress.setAddressDetail("KL, Malaysia");
    }else {
      studentAddress = studentAddressRepository.findByAddressDetailContaining("KL, Malaysia").get(0);
    }
    studentAddressRepository.save(studentAddress);

    Student student1 = new Student();
    student1.setStudent_name("Mehdi");
    student1.setStudentAddress(studentAddress);

    Student student2 = new Student();
    student2.setStudent_name("Kon Pashm");
    student2.setStudentAddress(studentAddress);

    studentRepository.save(student1);
    studentRepository.save(student2);
  }
}
