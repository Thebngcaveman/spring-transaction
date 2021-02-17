package com.thecaveman.transaction.springtransaction.repository;

import com.thecaveman.transaction.springtransaction.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
