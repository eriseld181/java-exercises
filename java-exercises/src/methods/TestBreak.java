package methods;

public class TestBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int shuma = 0, numri = 0;
while(numri<20) {
	numri++;
	shuma +=numri;
//	System.out.println("shuma eshte: "+shuma);
	if(shuma>=100)
		break;
}
System.out.println("numri eshte: "+numri);
System.out.println("shuma eshte: "+shuma);
	}

}
