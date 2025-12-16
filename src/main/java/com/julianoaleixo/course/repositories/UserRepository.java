package com.julianoaleixo.course.repositories;

import com.julianoaleixo.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
