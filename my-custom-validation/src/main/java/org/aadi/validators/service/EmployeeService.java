package org.aadi.validators.service;

import org.aadi.validators.dto.Employee;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class EmployeeService {

    public Employee addNewEmployee(Employee employee){
        employee.setEmpId(new Random().nextInt(9000000));
        //add employee to database
        return employee;
    }
}
