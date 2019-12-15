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
		s.setSid(116);
		s.setSname("chandra");
		Configuration cfg=new Configuration();
		cfg.configure("mapingfile/studentconfigure.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		//session.saveOrUpdate(s);//it will insert data and if in db have same object then update data
		
		//session.save(s);it will insert data and return primary key value
		
		//	session.get(Student.class, 112);it is select the data in the table
		
		//session.update(s);it is update data in the table if have in table we want to enter all non primary values to update
		//session.merge(s);it is not check duplicate or not it will update data inthe table
		session.delete(s);//it will delete the row from the table
		
		
		//Object o=session.get(Student.class, 116); it give null pointer exception
		//Object o=session.load(Student.class,116); it give Object Not found exception
		Object o=session.get(Student.class, 112);//it will select the data in the particular table
		
		
		Student tem=(Student)o;
		System.out.println(tem.getSid());
		System.out.println(tem.getScourse());
		System.out.println(tem.getFee());
		System.out.println(tem.getSname());
		
		t.commit();
		session.evict(s);
		session.close();
		sf.close();
		System.out.println("update sucess");
		
		
	}

}
