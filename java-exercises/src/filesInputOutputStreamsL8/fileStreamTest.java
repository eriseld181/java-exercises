package filesInputOutputStreamsL8;
import java.io.*;
public class fileStreamTest {

	public static void main(String[] args) {
		
		try {
			byte bWrite[] = {11,12,13,14};
			OutputStream os = new FileOutputStream("test.txt");
			for(int x = 0; x<bWrite.length;x++) {
				os.write(bWrite[x]);//write the bytes
			}
			os.close();
			InputStream is = new FileInputStream("test.txt");
			int size = is.available();
			for(int i=0;i < size; i++ ) {
			System.out.print((char) is.read() + " ");
			}
			is.close();
		}catch(IOException e) {
			System.out.println("Exception");
		}

	}

}