package filesInputOutputStreamsL8;
import java.io.*;
public class ReadStringFile {

	public static void main(String[] args) throws IOException{
		//1. Opening the file for reading
		FileReader f = new FileReader("test11.txt");
		BufferedReader in = new BufferedReader(f);
		//2. Reading a line from the text of the file
		//in.readLine(); // lexon rreshtin e pare
		//in.readLine(); // lexon rreshtin e dyte, ben skip te parin, e keshtu me rralle...
		
		System.out.println(in.readLine());
		f.close();

	}

}
