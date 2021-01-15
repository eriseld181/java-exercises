
public class FibonacciSequence {
	
public static void main(String[] args) {

	System.out.print("Type a number: ");
	int n = 5;
	int nr1 = 0;
	int nr2 = 1;
	System.out.print(nr1 +", "+ nr2+", ");
	for(int i=0; i< n; i++) {
		int sumOfLastTwo;
		sumOfLastTwo = nr1+nr2;
		System.out.print(sumOfLastTwo+", ");
		nr1= nr2;
		nr2= sumOfLastTwo;
}
}
}
