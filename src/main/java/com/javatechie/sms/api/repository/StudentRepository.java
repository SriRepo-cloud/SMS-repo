package com.javatechie.sms.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javatechie.sms.api.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
