package com.tutorial.online_tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubCategories extends JpaRepository<SubCategories,Long> {
}
