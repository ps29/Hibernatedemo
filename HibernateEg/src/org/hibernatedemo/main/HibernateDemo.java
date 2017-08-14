package org.hibernatedemo.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernatedemo.model.User;

public class HibernateDemo {
	public HibernateDemo() {
		
	}
public static void main(String[] args) {
	SessionFactory sessionFactory = (new Configuration()).configure().buildSessionFactory();
	Session session = sessionFactory.openSession();
	session.beginTransaction();
	User user = new User();
	user.setName("Helleos");
	session.save(user);
	session.getTransaction().commit();
	session.close();
	
	
	
	
}
}
