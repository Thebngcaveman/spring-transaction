package com.thecaveman.transaction.springtransaction.service;

import com.thecaveman.transaction.springtransaction.model.Department;
import com.thecaveman.transaction.springtransaction.model.Employee;
import com.thecaveman.transaction.springtransaction.repository.DepartmentRepository;
import com.thecaveman.transaction.springtransaction.repository.EmployeeRepository;
import com.thecaveman.transaction.springtransaction.vo.EmployeeRequestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Transactional//roll back everything if error happned
    public String saveEmployee(EmployeeRequestVO employeeRequestVO){
        Department department = new Department();
        department.setDepartmentName(employeeRequestVO.getDepartmentName());
        department.setDepartmentCode(employeeRequestVO.getDepartmentName());

        Long departmentId = departmentRepository.save(department).getDepartmentId();

        Employee employee = null; //this cause error if you don't want it to roll back you can create
                                  //Employee employee = new Employee();
        employee.setName(employeeRequestVO.getEmployeeName());
        employee.setEmail(employeeRequestVO.getEmail());
        employee.setDepartmentId(departmentId);

        employeeRepository.save(employee);
        return "Employee is saved with Employee ID: "+employee.getEmployeeId();
    }
}











