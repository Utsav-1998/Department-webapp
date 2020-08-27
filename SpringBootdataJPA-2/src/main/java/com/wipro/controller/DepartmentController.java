package com.wipro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wipro.SpringbootDataJPA2.Department;
import com.wipro.SpringbootDataJPA2.service.DepartmentService;


@Controller
public class DepartmentController {
	
	@Autowired
	DepartmentService service;
	
	@RequestMapping("/menu")
	public String showMenu(Model m) {
		m.addAttribute("list",service.findall());
		return "Menu";
		
	}
	
	@RequestMapping("/insertForm")
	public String showInsertForm(Model m) {
		m.addAttribute("dept", new Department(0, null, null, 0));
		return "InsertForm";
	}
	
	@RequestMapping("/saveForm")
	public String saveForm( @ModelAttribute("dept")Department dept,Model m) {
		service.save(dept);
		m.addAttribute("msg","Inserted/updated Successfully");
		m.addAttribute("list",service.findall());
		return "Menu";
		
	}
	
	@RequestMapping("/showByName")
	public String showByNamePage() {
		return "ShowByName";
	}
	
	@RequestMapping("/deleteByName")
	public String deleteByNamePage() {
		
		return "DeleteByName";
	}
	
	@RequestMapping("/byname")
	public String ShowByName(@RequestParam("txtDname") String dname,Model m) {
		m.addAttribute("list",service.getByDname(dname));
		return "ShowByName";
	}
	
	@RequestMapping("/deletebyname1")
	public String deleteByName(@RequestParam("txtDname") String dname,Model m) {
		if(service.deleteByname(dname))
			m.addAttribute("msg","Deleted Successfully");
		else
			m.addAttribute("msg", "Delete unSuccessful");
		m.addAttribute("list",service.findall());
		return "Menu";
		
	}
	
	@RequestMapping("/getBudget")
	public String getBudget() {
		return "showByBudget";
	}
	
	@RequestMapping("/showByBudget")
	public String showByBudget(@RequestParam("txtBudget") double budget,Model m) {
		m.addAttribute("list", service.findByBudgetGreaterThan(budget));
		return "Menu";
	}
	
	@RequestMapping("/orderedList")
	public String orderList(Model m) {
		m.addAttribute("list", service.findByDname());
		return "Menu";
	}
	
	

}
