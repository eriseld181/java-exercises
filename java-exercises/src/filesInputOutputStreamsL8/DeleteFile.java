package filesInputOutputStreamsL8;
import java.io.*;
public class DeleteFile {

	public static void main(String[] args) throws IOException{
	File f1 = new File("example.txt");
	boolean b = f1.delete();
	//if b is true, the the file has been deleted successfully
System.out.println(b);
	}

}
