package com.skilldistillery.jpacrud.entities;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PandemicTest {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Pandemic pandemic;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("PandemicPU");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		pandemic = em.find(Pandemic.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		pandemic = null;
	}

	@Test
	void test() {
		assertNotNull(pandemic);
		assertEquals("Covid-19", pandemic.getName());
		assertEquals(.01, pandemic.getPercentKilled());
		
	}

}
