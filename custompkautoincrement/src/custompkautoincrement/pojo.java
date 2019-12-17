package custompkautoincrement;

public class pojo {
private String acno;
private String name;
private long phno;
private String address;
private long adno;



public pojo(String acno, String name, long phno,String address, long adno) {
	
	this.acno = acno;
	this.name = name;
	this.address = address;
	this.adno = adno;
	this.phno=phno;
	
}
public pojo() {
	
}


public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
public String getAcno() {
	return acno;
}
public void setAcno(String acno) {
	this.acno = acno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getAdno() {
	return adno;
}
public void setAdno(long adno) {
	this.adno = adno;
}

}
