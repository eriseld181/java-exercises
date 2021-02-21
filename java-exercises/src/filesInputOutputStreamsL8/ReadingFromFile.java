package filesInputOutputStreamsL8;
import java.io.*;
public class ReadingFromFile {

	public static void main(String[] args) throws IOException{
		//1. Open the file to read
		FileReader f = new FileReader("test11.txt");
		//2.  creation of the object for reading
		BufferedReader in = new BufferedReader(f);
		//3. Reading a line of text from the file
		String line = in.readLine();
		System.out.println(line);
		// TODO Auto-generated method stub
		//4. Closing the file
		in.close();
		f.close();
	}

}
