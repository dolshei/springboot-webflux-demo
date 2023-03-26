package com.example.springbootwebfluxdemo.repository;

import com.example.springbootwebfluxdemo.entity.Employee;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface EmployeeRepository extends ReactiveCrudRepository<Employee, String> {
}
