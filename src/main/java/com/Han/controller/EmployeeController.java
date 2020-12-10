package com.Han.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Han.DAO.DepartmentDAO;
import com.Han.DAO.EmployeeDAO;
import com.Han.pojo.Department;
import com.Han.pojo.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeDAO empDao;
	
	@Autowired
	DepartmentDAO departmentDAO;
	
	@RequestMapping("/emps")
	public String list(Model model) {
		Collection<Employee> emps = empDao.getEmps();
		model.addAttribute("emps", emps);
		return "list";
	}
	
	@GetMapping("/emp")
	public String toAddpage(Model model) {
		Collection<Department> departments = departmentDAO.getDepartments();
		model.addAttribute("departments", departments);
		return "add";
	}
	
	@PostMapping("/emp")
	public String addEmp(Employee employee) {
		
		empDao.save(employee);
		
		return "redirect:/emps";
	}
	
	@GetMapping("/edit/{id}")
	public String toUpdatepage(@PathVariable("id") Integer id, Model model) {
		
		Employee employee = empDao.getEmpsById(id);
		model.addAttribute("emp", employee);
		
		Collection<Department> departments = departmentDAO.getDepartments();
		model.addAttribute("departments", departments);
		
		return "/update";
	}
	
	@PostMapping("/edit/updated")
	public String updated(Employee employee) {
		
		empDao.save(employee);
		return "redirect:/emps";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Integer id) {
		empDao.deleteEmps(id);
		return"redirect:/emps";
	}

}
