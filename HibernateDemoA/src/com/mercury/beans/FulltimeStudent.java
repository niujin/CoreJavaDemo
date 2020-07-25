package com.mercury.beans;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="student")
@DiscriminatorValue("full")
public class FulltimeStudent extends Student {
	
	
	private int years;
	
	@Column(name="years")
	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}
	
}
