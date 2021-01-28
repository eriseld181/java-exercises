package homework_1;
import java.util.ArrayList;
public class bashkimArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> array1 = new ArrayList<Integer>();
		array1.add(1);
		array1.add(2);
		array1.add(3);
		array1.add(4);
		System.out.println(array1);
		ArrayList<Integer> array2 = new ArrayList<Integer>();
		array2.add(5);
		array2.add(6);
		array2.add(7);
		array2.add(8);
		System.out.println(array2);
		array1.addAll(array2);
		System.out.println(array1);
		
	}

}
