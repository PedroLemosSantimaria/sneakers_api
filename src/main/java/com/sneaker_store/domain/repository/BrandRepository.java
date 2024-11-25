package com.sneaker_store.domain.repository;

import com.sneaker_store.domain.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Long> {
}