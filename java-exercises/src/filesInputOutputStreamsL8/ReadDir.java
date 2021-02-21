package filesInputOutputStreamsL8;
import java.io.*;
public class ReadDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File file = null;
String[] paths;

try {
	//create new file object
	file = new File("/tmp");
	//array of files and directory
	paths = file.list();
	
	//for each name in the path array
	for(String path :paths) {
	System.out.println(path);
	}
}catch(Exception e) {
	e.printStackTrace();
}
	}

}
