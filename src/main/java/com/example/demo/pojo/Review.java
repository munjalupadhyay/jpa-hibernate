package com.example.demo.pojo;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Review {

    @Id
    @GeneratedValue
    private Long id;
    private String reviewText;

    @OneToOne
    private StudentCourse studentCourse;
}
