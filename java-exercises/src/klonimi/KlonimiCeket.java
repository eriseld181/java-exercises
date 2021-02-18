package klonimi;
class Address{
	int pinCode;
	String city;

Address(){}
Address(int pinCode, String city){
	this.pinCode = pinCode;
	this.city = city;
	
}}

	class Studenti3 implements Cloneable {
	int id;
	String name;
	//Rasti 1
	Address address = new Address();
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	}
	public class KlonimiCeket {
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
Studenti3 student = new Studenti3();
student.name = "artan";
student.id = 2;
student.address = new Address(101,"Tirane");
System.out.println("emri: " +student.name + " id: "+student.id +
		" qyteti: "+student.address.city + " zip: "+student.address.pinCode + ". ");
//klonimi
Studenti3 studentiKlonuar = (Studenti3) student.clone();
studentiKlonuar.name = "ermir";
studentiKlonuar.id = 4;
studentiKlonuar.address = new Address(102, "Berat");
System.out.println("-----klonimi-----");
System.out.println("emri: " +student.name + " id: "+student.id +
		" qyteti: "+student.address.city + " zip: "+student.address.pinCode + ". ");
System.out.println("emri: " +studentiKlonuar.name + " id: "+studentiKlonuar.id +
		" qyteti: "+studentiKlonuar.address.city + " zip: "+studentiKlonuar.address.pinCode + ". ");



	}

}
