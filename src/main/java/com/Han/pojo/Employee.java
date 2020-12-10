package com.Han.pojo;

import java.util.Date;

public class Employee {
	
	private Integer id;
	private String lastname;
	private String email;
	private Boolean gender;
	private Date DoB;
	
	private Department department;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public Date getDoB() {
		return DoB;
	}

	public void setDoB(Date doB) {
		DoB = doB;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee(Integer id, String lastname, String email, Boolean gender, Department department) {
		super();
		this.id = id;
		this.lastname = lastname;
		this.email = email;
		this.gender = gender;
		DoB = new Date();
		this.department = department;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", lastname=" + lastname + ", email=" + email + ", gender=" + gender + ", DoB="
				+ DoB + ", department=" + department + "]";
	}
	
	
	
}
