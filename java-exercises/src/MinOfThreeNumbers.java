/* Ndertoni nje program qe gjen minimumin midis 3 numrave 
 * qe jepen nga tastiera ku minimum te  ndertohet si metode. */
import java.util.Scanner;
public class MinOfThreeNumbers {
private static Scanner in;
public static void main(String[] args) {
	in = new Scanner(System.in);
	System.out.print("Input 3 numbers: "); 
	int nr1 =in.nextInt();
	int nr2 =in.nextInt();
	int nr3 =in.nextInt();
	int m = min(nr1, nr2, nr3);
	System.out.println("min is "+ m);
}
public static int min(int nr1, int nr2, int nr3) {int result;
	if (nr1 < nr2 && nr1 < nr3) {
		return nr1;
	}else if(nr2 < nr1 && nr2 < nr3) {
		return  nr2;
	}else {
		return  nr3;
	}
	}
}
