package klonimi;
class Adresa2 implements Cloneable{
	
	String qyteti;
	int kodi;
	Adresa2(){
		
	}
	Adresa2(String qyteti, int kodi){
		this.kodi=kodi;
		this.qyteti=qyteti;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
}
class Studenti2 implements Cloneable{
	int id;
	String emri;
	Adresa A = new Adresa();
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
	
	
}
public class shembull4DeepCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Studenti2 s = new Studenti2();
		s.emri = "eriseld";
		s.id=111;

		s.A.kodi=1032;
		s.A.qyteti="Tirane";
		
		Studenti2 s2= (Studenti2)s.clone();
	}

}
