package org.ATHTTT.sbshoppingcart.repository;

import org.ATHTTT.sbshoppingcart.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
}
