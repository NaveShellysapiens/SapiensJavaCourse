package com.sapiens.SpringSecurity.EmployeeManagment;

import com.sapiens.SpringSecurity.EmployeeManagment.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
