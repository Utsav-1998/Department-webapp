package com.wipro.SpringbootDataJPA2.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.wipro.SpringbootDataJPA2.Department;

public interface DepartmentDAO extends CrudRepository<Department, Integer> {
	
		public List<Department> getByDname(String dname);
		@Transactional
		public void deleteByDname(String dname);
		public List <Department> findByBudgetGreaterThan(double budget);
		@Query("from Department order by budget")
		List<Department> findByDname();
 
}
