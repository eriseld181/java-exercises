//arithmetic exceptions and general exceptions
package trycatchexeptions;
public class Example {

	public static void main(String[] args) {
		int num1, num2;
		try {
			num1 = 0;
			num2=5/num1;
			System.out.println(num2);//error  / by zero
			System.out.println("the end of the block");
			
		
			}
			catch(ArithmeticException e){
			System.out.println("You should not divide a number by zero");
			}
			catch(Exception e){
			System.out.println("exception occurred");
			}
		System.out.println("this line is out of try&catch");
		// TODO Auto-generated method stub

	}

}
