package methods;

public class TestMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i = 5, j = 2;
int k = min(i,j);
System.out.println("Minimumi midis " + i + " dhe " + j + " është " + k);
	}
public static int min( int n1, int n2) {
int result;

	if(n1<n2) {
	result = n1;
	}else {
		result = n2;
	}
return result;
}
}
