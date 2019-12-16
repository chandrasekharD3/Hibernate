package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.actors;

public class Client {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("xmlfiles/configure.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		actors a=new actors(0,"chiru","megastar","tollywood");
		s.save(a);
		t.commit();
		s.close();
		sf.close();
		
	}

}
