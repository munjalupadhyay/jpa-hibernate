package com.example.demo.repository;

import com.example.demo.pojo.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {
}
