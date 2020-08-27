package com.wipro.SpringbootDataJPA2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wipro.SpringbootDataJPA2.Department;
import com.wipro.SpringbootDataJPA2.dao.DepartmentDAO;

public class DepartmentServiceImpl  implements DepartmentService{
	
	@Autowired
	DepartmentDAO dao;
	

	@Override
	public Department save(Department d) {
		// TODO Auto-generated method stub
		return dao.save(d);
	}

	@Override
	public List<Department> findall() {
		// TODO Auto-generated method stub
		List<Department> list = new ArrayList<Department>();
		dao.findAll().forEach(dept ->list.add(dept));
		return list;
	}

	@Override
	public List<Department> getByDname(String dname) {
		// TODO Auto-generated method stub
		return dao.getByDname(dname);
	}

	@Override
	public boolean deleteByname(String dname) {
		// TODO Auto-generated method stub
		dao.deleteByDname(dname);
		return true;
	}

	@Override
	public List<Department> findByBudgetGreaterThan(double budget) {
		// TODO Auto-generated method stub
		return dao.findByBudgetGreaterThan(budget);
	}

	@Override
	public List<Department> findByDname() {
		// TODO Auto-generated method stub
		return dao.findByDname();
	}
		
}
