package com.javatpointmypackage;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class StoreData {
public static void main(String[] args) {

	//creating config object
	Configuration cfg= new Configuration();
	cfg.configure("hibernate.cfg.xml"); //populates data of config file
	
	//create session file
	SessionFactory factory= cfg.buildSessionFactory();
	
	//session object
	Session session=factory.openSession();
	
	//create transaction object
	Transaction t = session.beginTransaction();
	
	Employee e1 = new Employee();
	e1.setId(115);
	e1.setFirstName("Enigma");
	e1.setLastName("Stigma");
	
	session.persist(e1); //persisting object
	
	t.commit();
	session.close();
	System.out.println("Successfully saved");
	
	
	
}
}
