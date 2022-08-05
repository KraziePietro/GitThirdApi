package com.bikkadIT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikkadIT.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}
