package imputOutputStream;
import java.util.*;
import java.util.Scanner;

public class PositiveSequences {
	static Scanner in = new Scanner(System.in);
public static void myMethod() {
	double sum = 0;
	
int n = 5;
ArrayList<Integer> numbers = new ArrayList<Integer>();
for(int i = 0; i<n; i++) {
	int n1 = in.nextInt();
if( n1==0) {
	break;
}	else {
	
	System.out.print(n1 +", ");
sum=sum+ n1/i;
}

}System.out.println("shuma: "+sum);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("vendosni numrat");
		myMethod();
	}

}
