package com.sneaker_store.domain.repository;

import com.sneaker_store.domain.Sneaker;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SneakerRepository extends JpaRepository<Sneaker, Long> {
    @Query("SELECT s FROM Sneaker s ORDER BY s.imagePath DESC")
    List<Sneaker> findAllOrderByImagePathDesc();
}
