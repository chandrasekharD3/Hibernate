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
		df.setDid(15);
		df.setDname("mca");
		df.setDdes("master of computers");
		df.setDsal(40000);
		
		ef.setEid(17);
		ef.setDname("mca");
		ef.setEname("chandra");
		ef.setEsal(50000);
		
		sf.setSid(16);
		sf.setFee(10000);
		sf.setSbranch("civil");
		sf.setSname("sekhar");
		
		Configuration cfg=new Configuration();
		cfg.configure("maping/configur.cfg.xml");
		SessionFactory ssf=cfg.buildSessionFactory();
		Session s=ssf.openSession();
		Transaction t=s.beginTransaction();
		//it will return primary key value
		//int a=(int)s.save(df);
		//System.out.println(a);
		//it is not return any value
		//s.persist(df);
		//if ur table not contain same data that will create or update otherwise no action will perform like ex if u enter duplicate it will not allow
		
		s.saveOrUpdate(df);
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
