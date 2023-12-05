package com.bp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bp.dao.entity.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
    // Additional custom queries can be added here if needed
}
