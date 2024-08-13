package com.tmp.ems.tmpEMS.controllers;

import com.tmp.ems.tmpEMS.api.EmployeeApiDelegate;
import com.tmp.ems.tmpEMS.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeApiDelegateImpl implements EmployeeApiDelegate {

    public ResponseEntity<Employee> addEmployeeRecord(Employee employee){
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Employee> getEmployeeRecordById(Long employeeId){
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Employee> updateEmployeeRecordById(Long employeeId, Employee employee){
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
