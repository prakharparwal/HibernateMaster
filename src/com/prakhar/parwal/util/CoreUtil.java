package com.prakhar.parwal.util;

import org.hibernate.SessionFactory;

public class CoreUtil {

	public static SessionFactory sessionFactory = null;
	
	public static SessionFactory getSessionFactory() {
		
		
		return sessionFactory;
	}
}
