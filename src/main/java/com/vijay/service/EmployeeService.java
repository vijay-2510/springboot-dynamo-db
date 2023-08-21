package com.vijay.service;

import com.vijay.entity.Employee;
import com.vijay.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee getEmployeeById(String employeeId) {
        return employeeRepository.getEmployeeById(employeeId);
    }

    public String delete(String employeeId) {
        return employeeRepository.delete(employeeId);
    }

    public String update(String employeeId, Employee employee) {
        return employeeRepository.update(employeeId,employee);
    }
}
