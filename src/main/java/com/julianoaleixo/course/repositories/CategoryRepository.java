package com.julianoaleixo.course.repositories;

import com.julianoaleixo.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
