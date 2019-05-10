package com.example.springboot2.model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "Student_Address")
@Data
public class StudentAddress {

  @Id
  @GeneratedValue
  @Column(name="address_id")
  private int address_id;

  @Column(name="address_detail")
  private String addressDetail ;
}

