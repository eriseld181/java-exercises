package filesInputOutputStreamsL8;
import java.io.*;
public class RenameFile {

	public static void main(String[] args) throws IOException{
		File f1 = new File("text8.txt");
		File f2 = new File("ndryshoi3.txt");
		boolean b = f1.renameTo(f2);
		System.out.println(b);
		if(b==true) {
			System.out.println("u ndryshua "+f1.getName()+ " ne emrin: "+ f2.getName());
		}

	}

}
