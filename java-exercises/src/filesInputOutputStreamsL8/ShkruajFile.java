package filesInputOutputStreamsL8;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

import java.io.IOException;


public class ShkruajFile {

	public static void main(String[] args) throws IOException{
		Path fileName = Path.of("eriseld.txt");
		String content = "hello world";
		Files.writeString( fileName, content);
		String actual = Files.readString(fileName);
		System.out.println(actual);
		
		// TODO Auto-generated method stub

	}

}
