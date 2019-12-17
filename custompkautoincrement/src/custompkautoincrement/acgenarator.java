package custompkautoincrement;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentityGenerator;

public class acgenarator extends IdentityGenerator 
{
	
	@Override
	public Serializable generate(SharedSessionContractImplementor s, Object obj) {
		String name="icici";
		try {
			Connection con=	s.connection();
			Statement st=con.createStatement();
			ResultSet res=st.executeQuery("select icici.nextval from dual");

			if(res.next()) {
				name=name+res.getInt(1);
		
			}
		}catch(Exception e) {}
		
		
		return name;

		
	}

}
