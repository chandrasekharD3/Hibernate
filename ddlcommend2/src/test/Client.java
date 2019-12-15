package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Deportmentfile;
import beans.Employeefile;
import beans.Studentfile;

public class Client {

	public static void main(String[] args) {
		Deportmentfile df=new Deportmentfile();
		Employeefile ef=new Employeefile();
		Studentfile sf=new Studentfile();
		df.setDid(004);
		df.setDname("mca");
		df.setDdes("master of computers");
		df.setDsal(40000);
		ef.setEid(005);
		
		ef.setDname("mca");
		ef.setEname("chandra");
		ef.setEsal(50000);
		sf.setSid(006);
		sf.setFee(10000);
		sf.setSbranch("civil");
		sf.setSname("sekhar");
		Configuration cfg=new Configuration();
		cfg.configure("maping/configur.cfg.xml");
		SessionFactory ssf=cfg.buildSessionFactory();
		Session s=ssf.openSession();
		Transaction t=s.beginTransaction();
		s.save(df);
		s.save(ef);
		s.save(sf);
		t.commit();
		s.evict(df);
		s.evict(ef);
		s.evict(sf);
		s.close();
		ssf.close();
		
	}

}
