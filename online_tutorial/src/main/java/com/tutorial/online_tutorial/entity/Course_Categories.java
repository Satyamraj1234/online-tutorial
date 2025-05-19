package com.tutorial.online_tutorial.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="course_categories")
public class Course_Categories {
    @Id
    @ManyToOne
    @JoinColumn(name = "course_id",nullable = false)
    private  Course course;
    @Id
    @ManyToOne
    @JoinColumn(name="category_id",nullable = false)
    private Category category;
}
