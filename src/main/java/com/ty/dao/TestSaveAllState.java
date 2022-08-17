package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Capital;
import com.ty.dto.State;

public class TestSaveAllState {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		State state = new State();
		state.setStateName("KARNATAKA");
		state.setChiefMinister("Somappa Bommai");
		state.setPopulation(6.41);

		Capital capital = new Capital();
		capital.setCapitalName("BANGLORE");
		capital.setFounder("kempe gowda");
		capital.setCode(560002);

		state.setCapital(capital);

		entityTransaction.begin();
		entityManager.persist(state);
		entityManager.persist(capital);
		entityTransaction.commit();
		System.out.print("-------DATA STORED-------");
	}

}
