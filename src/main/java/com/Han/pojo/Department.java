package com.Han.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Department {
	private Integer id;
	private String DepartmentName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDepartmentName() {
		return DepartmentName;
	}
	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}
	public Department(Integer id, String departmentName) {
		super();
		this.id = id;
		DepartmentName = departmentName;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", DepartmentName=" + DepartmentName + "]";
	}
	
	
}
