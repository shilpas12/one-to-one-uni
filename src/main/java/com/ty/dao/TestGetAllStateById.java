package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Capital;
import com.ty.dto.State;

public class TestGetAllStateById {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		
		State state=entityManager.find(State.class, 1);
		System.out.println(state.getId());
		System.out.println(state.getStateName());
		System.out.println(state.getChiefMinister());
		System.out.println(state.getPopulation());
		
		Capital capital=state.getCapital();
		if(capital!=null) {
			System.out.println("-----------------------------------");
			System.out.println(capital.getId());
			System.out.println(capital.getCapitalName());
			System.out.println(capital.getFounder());
			System.out.println(capital.getCode());
			System.out.println("------------------------------------");
		}
	}

}
