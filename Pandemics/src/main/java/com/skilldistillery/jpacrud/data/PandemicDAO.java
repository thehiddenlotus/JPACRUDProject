package com.skilldistillery.jpacrud.data;

import java.util.List;

import com.skilldistillery.jpacrud.entities.Pandemic;

public interface PandemicDAO {

	Pandemic findByID(int id);
	List<Pandemic> findAll();
	
}
