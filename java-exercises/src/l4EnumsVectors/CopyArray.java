package l4EnumsVectors;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {1,2,3,4,5};
		int aCopy[] = new int[a.length];
		for(int i = 0; i<a.length;i++) {
			aCopy[i] = a[i];
		}
		for(int n:aCopy) {
			System.out.print(n);
		}
char[] array = {'a','b','c','d'};
char[] copyArray = new char[array.length];
System.arraycopy(array, 0, copyArray, 0, copyArray.length);

System.out.println(copyArray);
	}

}
