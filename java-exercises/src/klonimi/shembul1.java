/*te ndertoni klasen objekt duke perdorur operatorin e shoqerimit*/
package klonimi;
class Student{
	int id;
	String emri;
	
}
public class shembul1 {
public static void main(String[]args) {
	Student objekt1 = new Student();
	objekt1.id=123;
	objekt1.emri="ermir";
	
	Student objekt2 = objekt1;//operatori i shoqerimi
	objekt2.id=1;
	objekt2.emri="Klevin";
	System.out.println("afisho objektin e pare ");
	System.out.println("afisho emrin: "+ objekt1.emri + ", afisho id: "+ objekt1.id);
	System.out.println("afisho objektin e dyte ");
	System.out.println("afisho emrin: "+ objekt2.emri + ", afisho id: "+ objekt2.id);
	
	
}
}
