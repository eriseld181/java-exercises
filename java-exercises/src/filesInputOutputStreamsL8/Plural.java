package filesInputOutputStreamsL8;
import java.io.*;
public class Plural {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader keyboard = new BufferedReader(isr);
System.out.println("insert a word");
String line = keyboard.readLine();
System.out.println(line);
System.out.println("s");
	}

}
