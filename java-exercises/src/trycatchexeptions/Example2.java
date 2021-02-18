package trycatchexeptions;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int a[] = new int[7];
	a[4] = 30/5;
	System.out.println("we are inside of try block");
	System.out.println("a[4] = 30/5 is "+ a[4]);
}

catch(ArithmeticException e) {
	System.out.println("Warning: Arithmetic Exception");
}

catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("Warning: ArrayIndexOutOfBoundsException");
}
catch(Exception e) { 
	System.out.println("Warning: Another Exception");
}
	}

}
