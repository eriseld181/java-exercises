package filesInputOutputStreamsL8;
import java.io.File;
import java.io.IOException;
public class Tekst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	File myObj = new File("filename12.txt");
	if(myObj.createNewFile()) {
		System.out.println("file created "+ myObj.getName() 
		+ " with path: "+ myObj.getAbsolutePath());
	}else {
		System.out.println("file exist");
	}
}catch(IOException e) {
e.printStackTrace();
System.out.println("error");
}
	}

}
