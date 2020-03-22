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

	@Override
	public Pandemic create(Pandemic pan) {
		// write the customer to the database
		em.persist(pan);
		// update the "local" Customer object
		em.flush();		
		return pan;
	}

	@Override
	public Pandemic update(int id, Pandemic pan) {
		Pandemic managedPan = em.find(Pandemic.class, id);

		// update the values of the managed entity
		managedPan.setName(pan.getName());
		managedPan.setDeathToll(pan.getDeathToll());

		return managedPan;
	}

	@Override
	public boolean destroy(int id) {
		
		Pandemic managedPan = em.find(Pandemic.class, id);	
		if (managedPan != null) {
			em.remove(managedPan); // performs the delete on the managed entity
			em.flush();
			System.out.println(managedPan);
			if (false == em.contains(managedPan)) {				
				return true;
			}
		}
		return false;
	}
}
