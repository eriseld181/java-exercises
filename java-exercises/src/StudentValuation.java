/*build a program that calculate the average of students grades.
 * Grades must be in an arrayList, and the user should put the values from the keyboard.*/
import java.util.ArrayList;
import java.util.Scanner;
public class StudentValuation {
private static Scanner in;
public static void main(String[] args) {
	in = new Scanner(System.in);
	ArrayList<Double> list = new ArrayList<Double>();
	System.out.print("Input students grades: "); 
	double nr1 = in.nextDouble();
	double nr2 = in.nextDouble();
	double nr3 = in.nextDouble();
	double nr4 = in.nextDouble();
	double nr5 = in.nextDouble();
	list.ensureCapacity(60);
	list.add(nr1);
	list.add(nr2);
	list.add(nr3);
	list.add(nr4);
	list.add(nr5);
	
	list.trimToSize();
	System.out.println(list);
	double average =0;
	double sum =0;
	for(int i=0; i< list.size(); i++) {
		sum = sum + list.get(i) ;
		 
		
	}
	average = sum/list.size();
	System.out.println("Mesatarja eshte " + average);

}
}
