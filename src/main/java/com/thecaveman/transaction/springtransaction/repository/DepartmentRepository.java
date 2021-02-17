package com.thecaveman.transaction.springtransaction.repository;

import com.thecaveman.transaction.springtransaction.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
