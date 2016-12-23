package com.capgemini.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.capgemini.adegua.parallelo.entities.Employee;

public class MainHibernate {
	public static void main(String[] args) {  

		Session session = HibernateUtils.getSessionFactory().openSession();


		session.beginTransaction();  

		Employee e1=new Employee();  
		e1.setId(1001);  
		e1.setFirstName("sonoo");  
		e1.setLastName("jaiswal");  
		
		session.save(e1);
		session.flush();
		session.getTransaction().commit();  
		session.close();  
		System.out.println("successfully saved");  
	}  
}
