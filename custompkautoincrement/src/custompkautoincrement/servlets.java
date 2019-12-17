package custompkautoincrement;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class servlets extends HttpServlet {
	SessionFactory sf;
	public void init(){
		Configuration cfg=new Configuration();
		cfg.configure("mapingfiles/configuration.cfg.xml");
		sf=cfg.buildSessionFactory();
		
	}
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		long phone=Long.parseLong((request.getParameter("phone")));
		
		String address=request.getParameter("address");
		long adno=Long.parseLong(request.getParameter("adno"));
		pojo p=new pojo(null,name,phone,address,adno);
	Session s=sf.openSession();
	String ac=(String)s.save(p);
	response.getWriter().println(ac);
		}
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String name=request.getParameter("name");
			long phone=Long.parseLong(request.getParameter("phone"));
			
			String address=request.getParameter("address");
			long adno=Long.parseLong(request.getParameter("adno"));
			pojo p=new pojo(null,name,phone,address,adno);
		Session s=sf.openSession();
		String ac=(String)s.save(p);
		s.beginTransaction().commit();
		response.getWriter().println(ac);
		
		
		}
		public void destroy() {
			
		}

}
