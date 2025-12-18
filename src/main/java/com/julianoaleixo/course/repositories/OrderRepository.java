package com.julianoaleixo.course.repositories;

import com.julianoaleixo.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
