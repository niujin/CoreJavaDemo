package com.mercury.tests;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.eclipse.persistence.sessions.factories.SessionManager;

import com.mercury.beans.User;

public class Test01 {

	private static final String PERSISTENCE_UNIT_NAME = "user";
	private static EntityManagerFactory factory;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factory=Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em =factory.createEntityManager();
		//em.getTransaction().begin();
		//em.persist(new User("Lucy",20));
		//em.getTransaction().commit();
		Query query=em.createQuery("select u from User u");
		List<User> users=query.getResultList();
		for(User user:users){
			System.out.println(user);
		}
		em.close();
	}

}
