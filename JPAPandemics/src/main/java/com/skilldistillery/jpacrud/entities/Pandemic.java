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
	@Column(name = "death_toll")
	private Integer deathToll;

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

	public Integer getDeathToll() {
		return deathToll;
	}

	public void setDeathToll(Integer deathToll) {
		this.deathToll = deathToll;
	}

	@Override
	public String toString() {
		return "ID: " + id + " " + name + "\tDeath Toll: " + deathToll;
	}

}
