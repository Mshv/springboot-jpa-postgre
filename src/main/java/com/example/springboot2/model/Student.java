package com.example.springboot2.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "STUDENT")
@Data
public class Student {
  @Id
  @GeneratedValue
  private int student_id;

  private String student_name;

  @ManyToOne
  @JoinColumn(name = "address_id", nullable = false)
  private StudentAddress studentAddress;
}

