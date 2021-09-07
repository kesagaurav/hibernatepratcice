package com.gaurav.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	@Column(name="name")
	public String name;
	@Column(name="salarly")
	public String salarly;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee( String name, String salarly) {
		super();
		this.name = name;
		this.salarly = salarly;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalarly() {
		return salarly;
	}
	public void setSalarly(String salarly) {
		this.salarly = salarly;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salarly=" + salarly + "]";
	}
	
	
	
	
	
}
