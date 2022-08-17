package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Company;
import com.ty.dto.Gst;

public class TestSaveGst {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Gst gst=new Gst();
	
		gst.setGstNumber("DGH868");
		gst.setStatus("ACTIVE");
		
		Company company=new Company();
		company.setName("Tom");
		company.setPhone(90879l);
		
		gst.setCompany(company);
		
		entityTransaction.begin();
		entityManager.persist(gst);
		entityManager.persist(company);
		entityTransaction.commit();
		System.out.print("-------DATA STORED-------");
		
	}

}
