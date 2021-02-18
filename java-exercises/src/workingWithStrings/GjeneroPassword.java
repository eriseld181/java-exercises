package workingWithStrings;
import java.util.*;
import java.time.*;
public class GjeneroPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner (System.in);
System.out.println("Vendos Emrin, mb, moshen");
String emri = in.next();
String mb = in.next();
int mosha = 18;
String parapasword = emri.substring(0,1)+mb.substring(0,1)+ String.valueOf(mosha).substring(0,1);
char[] ch = new char[parapasword.length()]; 
for (int i = 0; i < parapasword.length(); i++) { 
    ch[i] = parapasword.charAt(i); 
} 

// Printing content of array 
for (char c : ch) { 
    System.out.println(c); 
//    Math.random(parapasword.charAt(c);
} 


	}

}
