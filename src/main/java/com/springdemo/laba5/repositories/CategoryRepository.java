package com.springdemo.laba5.repositories;

import com.springdemo.laba5.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findById(long id);
}
