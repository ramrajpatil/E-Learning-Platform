package utils;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	// This class will be using native hibernate API.
	
	private static SessionFactory factory;
	
	// How to insure creation of singleton instance of the sessionFactory?
	// Eager Singleton Pattern: At the time of class loading, creation of instance of sessionFactory will be done.
	static {
		System.out.println("in Static init  block");
		factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}
	// Lazy singleton Pattern
//	public static SessionFactory getSessionFactory() {
//		System.out.println("in Static init  block");
//		factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//		return factory;
//	}
	
	// Generate getter for SF (Session factory).
	public static SessionFactory getFactory() {
		return factory;
	}
}
