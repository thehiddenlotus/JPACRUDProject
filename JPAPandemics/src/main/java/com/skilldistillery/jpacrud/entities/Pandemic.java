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
	@Column(name = "outbreak_location")
	private String location;
	private String type;
	private Integer start;
	private Integer end;

	public Pandemic() {
	}

	public Pandemic(int id, String name, Integer deathToll, String location, String type, Integer start, Integer end) {
		super();
		this.id = id;
		this.name = name;
		this.deathToll = deathToll;
		this.location = location;
		this.type = type;
		this.start = start;
		this.end = end;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getEnd() {
		return end;
	}

	public void setEnd(Integer end) {
		this.end = end;
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
		return id + " " + name + " " + type + ", Death Toll: " + deathToll + ", Outbreak Location: " + location + ", " + start + "-" + end;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deathToll == null) ? 0 : deathToll.hashCode());
		result = prime * result + ((end == null) ? 0 : end.hashCode());
		result = prime * result + id;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((start == null) ? 0 : start.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pandemic other = (Pandemic) obj;
		if (deathToll == null) {
			if (other.deathToll != null)
				return false;
		} else if (!deathToll.equals(other.deathToll))
			return false;
		if (end == null) {
			if (other.end != null)
				return false;
		} else if (!end.equals(other.end))
			return false;
		if (id != other.id)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (start == null) {
			if (other.start != null)
				return false;
		} else if (!start.equals(other.start))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	
	

}
