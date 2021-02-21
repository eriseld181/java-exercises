package filesInputOutputStreamsL8;
import java.io.File;

public class Prove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File myObj = new File("eriseld.txt");
if(myObj.exists()) {
	System.out.println("Emri i dosjes: " +
			myObj.getName());
	System.out.println("Absolute path: " +
			myObj.getAbsolutePath());
	System.out.println("SHkruaj: " + myObj.canWrite());
	System.out.println("Lexo " + myObj.canRead());
	System.out.println("Permasa e dosjes ne byte " +
			myObj.length());
}else {
	System.out.println("Kjo dosje nuk ekziston.");
}
	}

}
