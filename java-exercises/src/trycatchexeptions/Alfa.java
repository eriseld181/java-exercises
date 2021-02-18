package trycatchexeptions;
import java.util.*;
public class Alfa {
	static void function(int a, int b)throws ArithmeticException,ArrayIndexOutOfBoundsException{
		System.out.println(10/a);
		int arr[]= {1,2,3};
		System.out.println("vektori "+ arr[b]);
	} 
	
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
for(int i = 0; i<3; i++) {
	try {
		System.out.println("vendos vlerat e A dhe b");
		function(in.nextInt(), in.nextInt());
	}catch(ArithmeticException e){
		System.out.println("nuk pjestohet me 0");
		
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("vlera esht jasht kufinjve");
	}
}
//
//try {
//	int a[]=new int[10];
//	 a[11]=10;
//	 System.out.println("afsho "+ a[11]);
//}catch(ArrayIndexOutOfBoundsException e){
//	System.out.println();
//	
//}
//	try { 
//		int num = Integer.parseInt("abc");
//		System.out.println("afisho"+ num);
//	}catch(NumberFormatException e) {
//		System.out.println("formati i panjohur");
//	}
//	try{
//		String str = "leksioni i 4";
//	char c = str.charAt(1);
//	System.out.println("afisho " + c);
//	}catch(StringIndexOutOfBoundsException e) {
//		System.out.println("pertej kapacitetit");
//	}
	//TESTI
//	try {
//	throw 10;
//}
//catch (int e) {
//	System.out.println(e);
//}error


}
}
