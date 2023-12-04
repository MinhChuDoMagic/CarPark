package com.mock1.carPark.service;

import com.mock1.carPark.domain.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee add(Employee employee);
    public List<Employee> get();
}
