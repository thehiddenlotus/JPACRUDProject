package com.skilldistillery.jpacrud.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.jpacrud.entities.Pandemic;

@Service
@Transactional
public class PandemicDAOImpl implements PandemicDAO {
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public Pandemic findByID(int id) {
		return em.find(Pandemic.class, id);
	}

	@Override
	public List<Pandemic> findAll() {
		String jpql = "SELECT p FROM Pandemic p";
		return em.createQuery(jpql, Pandemic.class).getResultList();
	}

}
