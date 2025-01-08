package com.mvc.controller;

public class User {
	private Integer id;
	private String name;
	private String Address;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public User(Integer id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
}
