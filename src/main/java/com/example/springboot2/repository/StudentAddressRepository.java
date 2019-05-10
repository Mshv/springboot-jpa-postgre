package com.example.springboot2.repository;

import com.example.springboot2.model.Student;
import com.example.springboot2.model.StudentAddress;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentAddressRepository extends CrudRepository<StudentAddress,Integer> {

  @Query("Select c from StudentAddress c where c.addressDetail like:addressDetail")
  List<StudentAddress> findByAddressDetailContaining(@Param("addressDetail")String addressDetail);
}
