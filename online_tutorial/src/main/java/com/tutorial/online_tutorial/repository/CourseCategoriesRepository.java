package com.tutorial.online_tutorial.repository;

import com.tutorial.online_tutorial.entity.Course_Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseCategoriesRepository extends JpaRepository<Course_Categories,Long> {
}
