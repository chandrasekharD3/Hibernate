package test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.spi.SessionFactoryBuilderImplementor;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.internal.SessionFactoryImpl;

import beans.Student;
public class Client {

	public static void main(String[] args) {
		Student st=new Student();
		st.setId(11);
		st.setName("pandari");
		st.setEmail("chandra.pandari12@gmail.com");
		
		st.setMarks(580);
		
		//student object state is transiant
		Configuration cfg=new Configuration();
		cfg.configure("resource/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		s.save(st);
		//student object state is persistant
		s.beginTransaction().commit();
		//student object will move database
		s.evict(st);
		//student object will be from presistant
		//gc will delete
	}

}
