package com.financial.institution.product.infrastructure.persistences.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositoryJPA extends JpaRepository {
    Object getByNumber(Integer id);
}
