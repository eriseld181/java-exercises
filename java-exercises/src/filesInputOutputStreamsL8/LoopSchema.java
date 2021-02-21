package filesInputOutputStreamsL8;
import java.io.*;

public class LoopSchema {
public static void saveArray(String [] v,int [] b, String filename)throws IOException{
	FileWriter f = new FileWriter(filename);
	PrintWriter out = new PrintWriter(f);
	for(int i=0; i < v.length; i++) {
		out.println(v[i]);
		
	}
	for(int i=0; i < b.length; i++) {
		out.println(b[i]);
		
	}
	out.close();
		f.close();
}
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		String []array = {"ana", "beni", "klejdi"};
		int []array1 = {1, 2, 3};
		String emri = "test11.txt";
		saveArray(array,array1, emri);
	}

}
