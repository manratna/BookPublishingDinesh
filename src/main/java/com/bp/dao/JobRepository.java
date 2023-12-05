package com.bp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bp.dao.entity.Job;

public interface JobRepository extends JpaRepository<Job, Long> {
    // Additional custom queries can be added here if needed
}
