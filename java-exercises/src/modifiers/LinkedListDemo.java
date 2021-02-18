package modifiers;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList ll = new LinkedList();
ll.add("F");
ll.add("B");
ll.add("D");
ll.add("E");
ll.add("C");
ll.add("Z");
ll.add("A");
ll.add(1,"A2");
System.out.println("Vlera Fillestare"+ ll);
//Fshijme element nga lista
ll.remove("F");
ll.remove(2);
System.out.println("after remove method"+ ll);
//remove first and last element
ll.removeFirst();
ll.removeLast();
System.out.println(" remove first&last methods"+ ll);
//shto nje vlere ne nje pozicion
Object val = ll.get(2);
ll.set(2,(String)val + " Ndrysho");
System.out.println("lista pas ndryshimit"+ll);	}

}
