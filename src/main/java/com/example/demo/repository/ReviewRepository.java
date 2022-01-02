package com.example.demo.repository;

import com.example.demo.pojo.Course;
import com.example.demo.pojo.Review;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<Review, Long> {
}
