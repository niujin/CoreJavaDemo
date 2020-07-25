package com.mercury.daos;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.mercury.beans.User;

@Stateless
@Remote({HelloDao.class})
public class HelloDaoBean implements HelloDao {
	@PersistenceContext(unitName="myCast")
	private EntityManager em;
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		em.persist(user);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> query() {
		// TODO Auto-generated method stub
		return em.createQuery("select o from User o").getResultList();
	}

}
