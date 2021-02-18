package mypolimorfizm;

public class Member {
private int mosha;
private String emri;
private String nrTel;
private String adresa;
private double paga;
public Member(String emri,String nrTel,String adresa,double paga ) {
	emri = this.emri;
	mosha = this.mosha;
	nrTel = this.nrTel;
	adresa= this.adresa;
	
}

public void printPage(double paga, String emri ) {
	System.out.println("paga eshte: "+paga);
	
}
public int getMosha() {
	return mosha;
}

public void setMosha(int mosha) {
	this.mosha = mosha;
}

public String getEmri() {
	return emri;
}

public void setEmri(String emri) {
	this.emri = emri;
}

public String getNrTel() {
	return nrTel;
}

public void setNrTel(String nrTel) {
	this.nrTel = nrTel;
}

}
