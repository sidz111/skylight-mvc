package com.mvc.controller;

public class Hospital {
	private Integer id;
	private String hospital_name;
	private String address;
	private String opening_time;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getHospital_name() {
		return hospital_name;
	}
	public void setHospital_name(String hospital_name) {
		this.hospital_name = hospital_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getOpening_time() {
		return opening_time;
	}
	public void setOpening_time(String opening_time) {
		this.opening_time = opening_time;
	}
	public Hospital(Integer id, String hospital_name, String address, String opening_time) {
		super();
		this.id = id;
		this.hospital_name = hospital_name;
		this.address = address;
		this.opening_time = opening_time;
	}
	public Hospital() {
		super();
	}
}
