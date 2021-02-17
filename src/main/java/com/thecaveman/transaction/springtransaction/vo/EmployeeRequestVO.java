package com.thecaveman.transaction.springtransaction.vo;

import lombok.Data;

@Data
public class EmployeeRequestVO {
    private String employeeName;
    private String email;
    private String departmentName;

    public EmployeeRequestVO() {
    }

}
