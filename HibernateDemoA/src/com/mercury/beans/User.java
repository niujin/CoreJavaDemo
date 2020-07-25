package com.mercury.beans;

import javax.persistence.*;

@Entity
@Table (name="sample")
public class User {
	
	private String name;
	private int age;
	
	@Id
	@Column (name="Name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="Age")
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
