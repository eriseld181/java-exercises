package klonimi;
class Adresa{
	String qyteti;
	int kodi;
	Adresa(){}
	Adresa(String qyteti, int kodi){
		this.kodi=kodi;
		this.qyteti=qyteti;
	}
}
class Studenti implements Cloneable{
	int id;
	String emri;
	Adresa A = new Adresa();
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
	
	
}
public class shembull3 {

	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub
Studenti s = new Studenti();
s.emri = "eriseld";
s.id=111;

s.A.kodi=1032;
s.A.qyteti="Tirane";

//klonimi
Studenti s2= (Studenti)s.clone();
s2.emri = "miri";
s2.id=222;
s2.A=new Adresa("tirane",22222);
System.out.println("afisho objektin e pare ");
System.out.println("afisho emrin: "+ s.emri + ", afisho id: "+ s.id);
System.out.println("afisho zip kode: "+ s.A.kodi + ", afisho qyteti: "+ s.A.qyteti);
System.out.println("afisho objektin e dyte ");
System.out.println("afisho emrin: "+ s2.emri + ", afisho id: "+ s2.id);
System.out.println("afisho zip kode: "+ s2.A.kodi + ", afisho qyteti: "+ s2.A.qyteti);
System.out.println("jane keta objekte te njejte: "+ (s==s2));
System.out.println("objektet e adreses se njejte: "+ (s.A==s2.A));
	}

}
