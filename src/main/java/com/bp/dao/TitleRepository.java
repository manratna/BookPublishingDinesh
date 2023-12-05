package com.bp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bp.dao.entity.Title;

public interface TitleRepository extends JpaRepository<Title, Long> {
    // Additional custom queries can be added here if needed
}
