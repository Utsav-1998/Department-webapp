package com.wipro.SpringbootDataJPA2.service;

import java.util.List;

import com.wipro.SpringbootDataJPA2.Department;

public interface DepartmentService {
	
	public Department save(Department d);
	public List<Department> findall();
	public List<Department> getByDname(String dname);
	public boolean deleteByname(String dname);
	public List<Department > findByBudgetGreaterThan(double budget);
	public List<Department> findByDname();

}
