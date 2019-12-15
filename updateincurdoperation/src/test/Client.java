package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class Client {

	public static void main(String[] args) {
		Student s=new Student();
		s.setFee(10000);
		s.setScourse("java");
		s.setSid(112);
		s.setSname("sekhar");
		Configuration cfg=new Configuration();
		cfg.configure("mapingfile/studentconfigure.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		session.saveOrUpdate(s);
		//session.save(s);
		t.commit();
		session.evict(s);
		session.close();
		sf.close();
		
		
	}

}
