package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Pan;
import com.ty.dto.Person;

public class GetPersonById {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();

		Person person = entityManager.find(Person.class, 1);

		System.out.println("person id: " + person.getId());
		System.out.println("person name : " + person.getName());
		System.out.println("person age: " + person.getAge());

		Pan pan = person.getPan();
		if (pan != null) {
			System.out.println("person pan: " + pan.getId());
			System.out.println("person panNumber: " + pan.getPanNumber());
			System.out.println("person fatherName: " + pan.getFatherName());
		}

	}

}
