package com.tutorial.jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorial.jpa.model.Order;

public class ManyToManyTest {
	
	private final static String REPOSITORY_UNIT="tutorial-jpa";

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory(REPOSITORY_UNIT);
		
		EntityManager em = entityManagerFactory.createEntityManager();
		Order order = em.find(Order.class, 111);

		em.close();
		entityManagerFactory.close();
		System.out.println("Order  : " + order.getProductList());

	}
}
