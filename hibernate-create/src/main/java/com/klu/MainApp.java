package com.klu;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();//load config & create session factory
		
		Session session=factory.openSession();//open session
		
		Transaction tx=session.beginTransaction();//begin transaction
		
		Student s=new Student("Praneetha");
		Student p=new Student("Harshad");
		
		session.save(s);
		session.save(p);
		
		
		tx.commit();
		
		session.close();
		factory.close();
		
		System.out.println("Student data saved successfully!");

	}

}
