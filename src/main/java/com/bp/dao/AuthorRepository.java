package com.bp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bp.dao.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
