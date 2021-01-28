
import java.util.ArrayList;
public class CheckArrayList {	
	public static void main(String[] args) {	
		ArrayList<String> list = new ArrayList<String>();
		if(list.size()== 0) {
		System.out.println("Nuk ka element ne listen fillestare");}
		else {
			System.out.println(list);
		}
		list.add("element1");
		list.add("elementi2");
		list.add("elementi3");
		list.add("elementi4");
		if(list.size()== 0) {
		System.out.println("nuk ka element ne listen e dyte");}
		else {
			System.out.println(list);
		}
		
	}}
