package com.example.demo.repository;

import com.example.demo.pojo.Student;
import com.example.demo.pojo.StudentCourse;
import com.example.demo.pojo.StudentCourseId;
import org.springframework.data.repository.CrudRepository;

public interface StudentCourseRepository extends CrudRepository<StudentCourse, StudentCourseId> {
}
