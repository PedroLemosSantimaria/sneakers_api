package com.sneaker_store.domain.repository;

import com.sneaker_store.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
