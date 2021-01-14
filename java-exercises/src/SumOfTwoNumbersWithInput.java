import java.util.Scanner;
public class SumOfTwoNumbersWithInput {
private static Scanner input;
public static void main(String[]args) {
input = new Scanner(System.in);
System.out.print("Input the first number: "); 
int nr1 = input.nextInt();
System.out.print("Input the second number: "); 
int nr2 = input.nextInt();
int s = sum(nr1, nr2);


		System.out.println("The sum of "+ nr1 +" + "+nr2 +" = "+s +".");
	
}
public static int sum(int nr1, int nr2) {int result;
return result = nr1+nr2;

}
}
