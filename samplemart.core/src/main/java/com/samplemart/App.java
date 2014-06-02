package com.samplemart;

import org.hibernate.Session;

import com.samplemart.model.Store;
import com.samplemart.utils.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession();
 
		session.beginTransaction();
		Store store = new Store();
 
		store.setName("Store 1");
		store.setAddress("126A Dien Bien Phu, Q.1 - HCM city");
		store.setPhone("08.1234.567");
		session.save(store);
		session.getTransaction().commit();
		
		System.out.println("Saved ! :)");
    }
}
