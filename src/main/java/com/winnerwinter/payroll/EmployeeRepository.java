package com.winnerwinter.payroll;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
