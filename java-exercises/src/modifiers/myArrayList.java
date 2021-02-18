package modifiers;
import java.util.*;

public class myArrayList {
public static void main(String[] args) {
	LinkedList <String> linkedList = new LinkedList<String>();
	linkedList.add("red");
	linkedList.add("green");
	linkedList.add("black");
	linkedList.add("white");
	linkedList.add("pink");
	System.out.println("Original linked list"+ linkedList);
	//Convert a linked list into array list
	List <String> list = new ArrayList<String>(linkedList);
	System.out.println(list);
	for(String str :list) {
System.out.println(str);
} 
}}
