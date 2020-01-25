package com.prakhar.parwal.providers;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactoryProvider {

	private static SessionFactory sessionFactory = null;
	
	private SessionFactoryProvider() {
		
	}
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory == null) {
			
			StandardServiceRegistry  standardServiceRegistry = new StandardServiceRegistryBuilder().configure().build();
			MetadataSources metaDataSources = new MetadataSources(standardServiceRegistry);
			Metadata metaData = metaDataSources.getMetadataBuilder().build();
			
			sessionFactory = metaData.getSessionFactoryBuilder().build();
		}
		return sessionFactory;
	}
}
