
package trycatchexeptions;
public class Example3 {

//exception doesn't happen
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =10;
		int y = 10; 
		try {
			int num = x/y;
			System.out.println("next-statement: inside try block");
			System.out.println("num is "+ num);
		}catch (Exception ex) {
			System.out.println("Exception");
		}
		System.out.println("next-statement: outside try block");
		

	}

}
