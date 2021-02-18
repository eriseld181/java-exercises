package modifiers;
import java.util.*;
class Book{
	int id, sasia;
	String emri, autori, botuesi;
	
	public Book(int id, String emri, String autori, String botuesi, int sasia) {
		this.id = id;
		this.sasia = sasia;
		this.emri = emri;
		this.autori = autori;
		this.botuesi = botuesi;
	}
	
}

public class LinkedListExample {

	public static void main(String[] args) {
		// KRIJO NJE LISTE ME LIBRA
		List <Book> list = new LinkedList<Book>();
		//krijo librat
		Book b1 = new Book(101, "kronike n gur I", "dudaj","albas", 500);
		Book b2 = new Book(102, "kronike n gur II", "dudaj","albas", 400);
		Book b3 = new Book(103, "kronike n gur III", "dudaj","albas", 200);
		System.out.println("ne nje fare menyre asgje");
		list.add(b1);
		list.add(b2);
		list.add(b3);
//		System.out.println(list);// QE TE AFISHOHET DUHET CIKLI FOR
		for(Book b:list) {
			System.out.println(b.id +" "+ b.emri +" "+b.autori +" "+b.botuesi +" "+b.sasia +" cope.");
		}

}}
