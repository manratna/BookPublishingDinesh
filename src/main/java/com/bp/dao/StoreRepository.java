package com.bp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bp.dao.entity.Store;

public interface StoreRepository extends JpaRepository<Store, Long> {
    // Additional custom queries can be added here if needed
}
