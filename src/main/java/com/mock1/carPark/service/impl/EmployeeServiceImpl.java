package com.mock1.carPark.service.impl;

import com.mock1.carPark.domain.Employee;
import com.mock1.carPark.repository.EmployeeRepository;
import com.mock1.carPark.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    @Override
    public Employee add(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> get() {
        return employeeRepository.findAll();
    }
}
