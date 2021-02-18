/*te ndertohet kodi qe paraqet permbjten e nje tabele objektesh te tipit string
 * qe shton 4 element,
 * paraqet elementin me index 1,
 * ndryshon emertimin e elementit me indeks 1,
 * afishon elementet e tabeles*/
import java.util.ArrayList;
import java.util.Scanner;
public class MyObjectTable {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		System.out.print("Fusni 4 elemente: "); 
		String elementi1 = in.next();
		String elementi2 = in.next();
		String elementi3 = in.next();
		String elementi4 = in.next();
		list.add(elementi1);
		list.add(elementi2);
		list.add(elementi3);
		list.add(elementi4);
		System.out.println(list);
		System.out.println("Vlera tek indeksi 1: "+list.get(1));
		list.set(1, "u ndryshua");
		System.out.println(list);
		
		//inverse
	
		for(int i = list.size()-1 ; i>= 0;i--) {
			
			System.out.print(list.get(i) +",");
		}
			
	}
}
