package com.employee.spring_crud_app.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.spring_crud_app.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    Employee getByName(String name);

    Employee findByName(String name);
}
