import java.util.ArrayList;
import java.util.Scanner;
public class Car {
	private static Scanner in;
	public static void main(String[] args) {	
		in = new Scanner(System.in);
	ArrayList<String> list = new ArrayList<String>();
	System.out.print("Fusni numrin e makinave: "); 
	int nrMakinave = in.nextInt();
	for(int i = 0; i< nrMakinave; i++) {
		list.add(in.next());
	}
	System.out.print(list);
	for(int i=0; i<list.size(); i++) {
		if(i%2==0) {
			System.out.print(list.get(i));
		}
	}
	
	}
	
}
}
