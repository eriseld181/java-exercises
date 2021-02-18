package imputOutputStream;
import java.io.File;

public class Permasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File file = new File("Eriseld1.txt");
if(file.exists()) {
	System.out.println("emri i file: "+ file.getName());
	System.out.println("path i file: "+ file.getAbsolutePath());
	System.out.println("shkruaji file: "+ file.canWrite());
	System.out.println("lexo file: "+ file.canRead());
	System.out.println("permasa e files ne byte: "+ file.length());
}
	}

}
