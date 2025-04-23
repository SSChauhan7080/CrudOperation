package com.crud.CrudTask.UserRepository;

import com.crud.CrudTask.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
