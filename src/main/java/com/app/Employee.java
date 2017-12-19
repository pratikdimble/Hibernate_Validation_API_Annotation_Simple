package com.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;

@Entity
@Table(name="Emp_Valid")
public class Employee {
	
	private int id;
	private String name;
	private float sal;
	
	@Id
	@Column(length=10)
	@Type(type="int")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(length=15)
	@Type(type="string")
	@NotNull(message="Name is Required")
	@Size(min=4,max=10,message="Name Must be in 5 to 10 chars only")
	@Pattern(regexp="ps[A-Z]*",message="Name Must be Starts with ps")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(length=15,precision=2)
	@Type(type="float")
	@Min(value=5,message="Salary Must be minimum 5 digits")
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	
}
