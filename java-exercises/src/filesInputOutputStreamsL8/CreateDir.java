package filesInputOutputStreamsL8;
import java.io.*;
public class CreateDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String dirName = "c:\\users\\user\\desktop\\javaDirektories";
File d = new File(dirName);
d.mkdirs();
	}

}
