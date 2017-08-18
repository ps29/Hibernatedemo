package com.javatpointmypackage;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		
		Employee e1 = new Employee();
		 e1.setId(1004);
		 e1.setFirstName("soonooja");
		 e1.setLastName("Agrawala");
		
		 Employee e2 = new Employee();
		 e2.setId(1003);
		 e2.setFirstName("Vimala");
		 e2.setLastName("Jaiswala");
		  session.persist(e1);
		  session.persist(e2);
		  
		  
		  t.commit();
		  session.close();
		  System.out.println("Save Sucessful");
	}

}
