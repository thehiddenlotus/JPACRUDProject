package com.skilldistillery.jpacrud.data;

import java.util.List;

import com.skilldistillery.jpacrud.entities.Pandemic;

public interface PandemicDAO {

	Pandemic findByID(int id);
	List<Pandemic> findAll();
	Pandemic create(Pandemic pan);
	Pandemic update(int id, Pandemic pan);
	boolean destroy(int id);
	
}
