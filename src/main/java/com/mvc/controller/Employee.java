package com.mvc.controller;

public class Employee {

	private Integer empId;
	private String name;
	private Long mobile;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public Employee(Integer empId, String name, Long mobile) {
		super();
		this.empId = empId;
		this.name = name;
		this.mobile = mobile;
	}
	public Employee() {
		super();
	}
}
