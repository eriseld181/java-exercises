package trycatchexeptions;
import java.util.*;
public class GirlsBoys {
	public static void main(String[] args) {
Scanner vlera = new Scanner(System.in);
System.out.println("jep nr e cunave");
int djem = vlera.nextInt();
System.out.println("jep nr e vajzave");
int goca = vlera.nextInt();
	
	if (djem == 0 && goca == 0) {
System.out.println("mesimi nuk zhvillohet se ska student");
System.exit(0);
	}else if(djem==0) {
		System.out.println("mesimi nuk zhvillohet se ska djem");
		System.exit(0);
	}else if(goca==0) {
		System.out.println("mesimi nuk zhvillohet se ska vajza");
		System.exit(0);
	}else if(goca>=0) {
		System.out.println("Djem qe do te kercejne jane " + goca/(double)djem +"goca");
		System.exit(0);
	}else
		System.out.println("Goca qe do te kercejne jane " + djem/(double)goca +"djem");
	System.out.println("Fillo kusrin e kercimit");}	
}
