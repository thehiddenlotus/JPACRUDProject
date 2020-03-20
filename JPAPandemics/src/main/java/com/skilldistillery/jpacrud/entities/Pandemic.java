package com.skilldistillery.jpacrud.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Pandemic {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	@Column(name = "percent_killed")
	private Double percentKilled;
	

	public Pandemic() {
	}

	public Pandemic(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	public Double getPercentKilled() {
		return percentKilled;
	}
	
	public void setPercentKilled(Double percentKilled) {
		this.percentKilled = percentKilled;
	}

	@Override
	public String toString() {
		return "Pandemic [id=" + id + ", name=" + name + "]";
	}

}
