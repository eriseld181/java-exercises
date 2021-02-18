package imputOutputStream;
import java.io.File;
import java.io.IOException;

public class Krijo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	File object = new File("eriseld.txt.txt");
	if(object.createNewFile()) {
		System.out.println("File u Krijua "+object.getName());
	}else {
		System.out.println("Ky Skedar Ekziston");
	}
}catch(IOException e) {
	System.out.println("gjernerohet nje gabim!");
e.printStackTrace();
}		

	}

}
