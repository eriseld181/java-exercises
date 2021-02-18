package klonimi;
class Nxenes implements Cloneable{
	String emri;
	int id;
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
public class shembull2_klonimi {

	public static void main(String[] args)throws CloneNotSupportedException {
		// TODO Auto-generated method stub
Nxenes n = new Nxenes();
n.emri = "abc";
n.id= 145;

Nxenes m = (Nxenes)n.clone();
//m.emri = "fff";
//m.id= 111;

System.out.println("afisho objektin e pare ");
System.out.println("afisho emrin: "+ n.emri + ", afisho id: "+ n.id);
System.out.println("afisho objektin e dyte ");
System.out.println("afisho emrin: "+ m.emri + ", afisho id: "+ m.id);


m.emri = "fff";
m.id= 111;

System.out.println("afisho objektin e pare te klonuar ");
System.out.println("afisho emrin: "+ n.emri + ", afisho id: "+ n.id);
System.out.println("afisho objektin e dyte te klonuar ");
System.out.println("afisho emrin: "+ m.emri + ", afisho id: "+ m.id);
	}

}
