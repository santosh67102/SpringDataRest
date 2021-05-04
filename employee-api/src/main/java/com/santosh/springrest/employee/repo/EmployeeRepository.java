package com.santosh.springrest.employee.repo;

import org.springframework.data.repository.CrudRepository;

import com.santosh.springrest.employee.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
