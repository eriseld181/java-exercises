package methods;
import java.util.Scanner;

public class SipRrethi {

	public static void main(String[] args) {
		// Deklarimi i konstanteve
		final double PI =Math.PI;
		double rrezja, sip;
		//Futja e Te Dhenave
		System.out.print("Fusni rrezen ");
		Scanner input = new Scanner(System.in);
		rrezja = input.nextDouble();
		sip = rrezja *rrezja*PI;
		System.out.println("Sipërfaqja e rrethit është:" + sip);
		
	}

}
