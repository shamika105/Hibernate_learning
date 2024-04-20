package com.pojo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.Product;


public class ProductTest {
	  
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf= cfg.buildSessionFactory();
		Session s=sf.openSession();
		 
		Transaction tx=s.beginTransaction();
		
		Product p=new Product();
		
//		to insert record into table
		p.setPid(101);
		p.setPname("Mobile");
		p.setPrice(20000);
		s.save(p);
		tx.commit();
		s.close();	
	}

}
