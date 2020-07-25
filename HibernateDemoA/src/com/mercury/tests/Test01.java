package com.mercury.tests;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mercury.beans.*;

public class Test01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		ParttimeStudent pstu = new ParttimeStudent();
		//fstu.setId(5);
		pstu.setName("Tom");
		pstu.setHours(50);
		session.save(pstu);
		tx.commit();
		//Query query =session.createQuery(hql);
		//List<FulltimeStudent> users=query.list();
		//for(FulltimeStudent u:users){
		//	System.out.println(u.getName());
		//}
		
		//User u=(User)session.load(User.class, "Scott");
		//System.out.println(u.getName());
	}

}
