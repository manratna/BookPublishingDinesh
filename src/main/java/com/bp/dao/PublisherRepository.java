package com.bp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bp.dao.entity.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
    // Additional custom queries can be added here if needed
}
