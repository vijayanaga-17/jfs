package com.example.chef_dishes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DishRepository extends JpaRepository<DishRepository, Long> {
    List<DishRepository> findByChefId(Long chefId);
}
