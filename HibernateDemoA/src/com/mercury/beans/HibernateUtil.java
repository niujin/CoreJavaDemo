package com.mercury.beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
	private static final SessionFactory Factory;
	static{
		try{
			Factory=new AnnotationConfiguration().configure().buildSessionFactory();
		}catch(Exception e){
			throw new RuntimeException(e.getMessage(),e);
		}
	}
	private static final ThreadLocal<Session> SESSION = new ThreadLocal<Session>();
	public SessionFactory getSessionFactory(){
		return Factory;
	}
	static public Session currentSession(){
		Session session = SESSION.get();
		if(session==null){
			session=Factory.openSession();
			SESSION.set(session);
		}
		return session;
	}
	static public void closeSession(){
		Session session =SESSION.get();
		SESSION.set(null);
		if(session!=null)
			session.close();
	}
}
