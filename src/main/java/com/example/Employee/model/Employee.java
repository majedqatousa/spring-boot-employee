package com.example.Employee.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Long id; 
	private String name; 
	private String email;
	private String jopTitle; 
	private String phone; 
	private String imgUrl;
	@Column(nullable = false, updatable = false)
	private String employeeCode;
	
	public Employee() {}
	
	

	public Employee(Long id, String name, String email, String jopTitle, String phone, String imgUrl,
			String employeeCode) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.jopTitle = jopTitle;
		this.phone = phone;
		this.imgUrl = imgUrl;
		this.employeeCode = employeeCode;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getJopTitle() {
		return jopTitle;
	}
	public void setJopTitle(String jopTitle) {
		this.jopTitle = jopTitle;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", jopTitle=" + jopTitle + ", phone="
				+ phone + ", imgUrl=" + imgUrl + ", employeeCode=" + employeeCode + "]";
	}
}
