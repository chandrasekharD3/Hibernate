package beans;

public class actors {
private int aid;
private String aname;
private String startag;
private String indes;

public actors(int aid,String aname,String startag,String indes) {
	this.aid=aid;
	this.aname=aname;
	this.startag=startag;
	this.indes=indes;
	
}
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getAname() {
	return aname;
}
public void setAname(String aname) {
	this.aname = aname;
}
public String getStartag() {
	return startag;
}
public void setStartag(String startag) {
	this.startag = startag;
}
public String getIndes() {
	return indes;
}
public void setIndes(String indes) {
	this.indes = indes;
}

}
