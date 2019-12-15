package test;
import javax.security.auth.login.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import beans.Customer;;
public class Client {

	public static void main(String[] args) {
		Customer c=new Customer();
		c.setCemail("chandra.pandu@gmail.com");
		c.setCid(004);
		c.setCname("chandra");
		c.setPhone(9701801027l);
		org.hibernate.cfg.Configuration cfg=new org.hibernate.cfg.Configuration();
		cfg.configure("documents/databaseconfigurate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		s.save(c);
		s.beginTransaction().commit();
		s.evict(c);
		
		
		
	}

}
