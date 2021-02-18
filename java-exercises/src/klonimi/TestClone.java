package klonimi;
class Student2 implements Cloneable{
	int id;
	String name;
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	} 
}
public class TestClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student2 studenti = new Student2();
		String emri = studenti.name = "elderis";
		int id = studenti.id = 1;
		System.out.println("emri: "+emri);
		System.out.println("id: "+id);
		//Klonimi i studenti
		Student2 studentiKlonuar = (Student2) studenti.clone();
		System.out.println("----------Pas klonimit------------");
		String emriKlonuar = studentiKlonuar.name = "eriseld"; 
		int idKlonuar = studentiKlonuar.id = 3; 
		System.out.println("emri: "+emri);
		System.out.println("id: "+id);
		System.out.println("emri i objektit te klonuar: "+emriKlonuar);
		System.out.println("id e objektit te klonuar: "+idKlonuar);

	}

}
