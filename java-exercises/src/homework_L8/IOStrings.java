package homework_L8;
import java.io.*;
import java.io.Serializable;

public class IOStrings implements Serializable{
	String[] loadArray(InputStreamReader is, int n) {
		InputStreamReader cin = null;
		try {
			cin = new InputStreamReader(System.in);
			System.out.println("Enter Words, 'q' to quit.");
			
			do {
			n = (char) cin.read();
			System.out.print(n);
			} while(n != 'q');
			}finally {
			if (cin != null) {
			cin.close();}}}}
	} 

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		
	}

}
