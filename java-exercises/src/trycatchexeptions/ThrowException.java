//Using a throw keyword to throw a new exception.
package trycatchexeptions;

public class ThrowException {
static void checkEligibilty(int stuAge, int stuWeight) {
	if(stuAge <12 && stuWeight <40) {
		throw new ArithmeticException("Student is not eligible for registration");
	}else {
		System.out.println("Student Entry is Valid!");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to registration process");
		checkEligibilty(10,39);
		System.out.println("Have a nice day");

	}

}
