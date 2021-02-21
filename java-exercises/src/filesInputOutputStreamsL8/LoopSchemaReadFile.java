package filesInputOutputStreamsL8;
import java.io.*;
public class LoopSchemaReadFile {
	public static String [] loadArrayToRead(String filename) throws IOException{
		// We first read the file to count the number of line
		FileReader f = new FileReader(filename);
		BufferedReader in = new BufferedReader(f);
		int n = 0;
		String line = in.readLine();
		
		while(line !=null) {
			n++;
			line = in.readLine();
		}
		f.close();
		
		//Creation of the array
		String []v = new String[n];
		// Loop to read the strings from the file into the array
		f = new FileReader(filename);
		in = new BufferedReader(f);
		int i = 0;
		line = in.readLine();
		while((line !=null )&& (i<n)) {
			v[i] =line;
		line = in.readLine();
		
		
			System.out.println(line);
			i++;
		}
		f.close();
		
		return v;
	} 

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		loadArrayToRead("test11.txt");
	}

}
