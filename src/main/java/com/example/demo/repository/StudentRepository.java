package com.example.demo.repository;

import com.example.demo.pojo.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
