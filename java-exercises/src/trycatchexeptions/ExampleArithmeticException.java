
package trycatchexeptions;

public class ExampleArithmeticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int num1 = 30, num2 = 0;
	int output = num1/num2;
	System.out.println("Result: "+ output);
}catch(ArithmeticException e) {
	System.out.println("You should not divide a number by 0");
}
	}

}
