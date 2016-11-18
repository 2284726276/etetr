package edu.tsinghua.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class BaseDao {
	static SessionFactory sessionFactory;
/*	static{
		Configuration cfg = new Configuration().configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(cfg.getProperties())
				.buildServiceRegistry();
		sessionFactory = cfg.buildSessionFactory(serviceRegistry);
		
	}
	*/
	public Session getSession(){
		return sessionFactory.openSession();
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public static void setSessionFactory(SessionFactory sessionFactory) {
		BaseDao.sessionFactory = sessionFactory;
	}
	
}
