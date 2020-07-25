package com.mercury.beans;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="student")
@DiscriminatorValue("part")
public class ParttimeStudent extends Student{
	
	private int hours;
	
	@Column(name="hours")
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
}
