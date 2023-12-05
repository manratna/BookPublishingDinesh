package com.bp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bp.dao.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Additional custom queries can be added here if needed
}
