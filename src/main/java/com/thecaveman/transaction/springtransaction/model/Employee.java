package com.thecaveman.transaction.springtransaction.model;

import javax.persistence.*;

@Entity
@Table(name = "employee_service")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    private String name;
    private String email;
    private Long departmentId;

    public Employee() {
    }

    public Employee(Long employeeId, String name, String email, Long departmentId) {
        this.employeeId = employeeId;
        this.name = name;
        this.email = email;
        this.departmentId = departmentId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }
}
