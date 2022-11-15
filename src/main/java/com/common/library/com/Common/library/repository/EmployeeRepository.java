package com.common.library.com.Common.library.repository;

import com.common.library.com.Common.library.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}