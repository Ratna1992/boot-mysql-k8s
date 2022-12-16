package com.boot.mysql.k8s.repo;

import org.springframework.stereotype.Repository;

import com.boot.mysql.k8s.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
