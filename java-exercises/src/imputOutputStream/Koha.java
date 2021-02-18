package imputOutputStream;
import java.io.*;
public class Koha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String inFile = "eriseld3.txt";
String outFile = "eriseld3.txt";
BufferedInputStream in = null;
BufferedOutputStream out = null;
long startTime, elapsedTime;
File Filein = new File(inFile);
System.out.println("permasa e file eshte: "+Filein.length()+" byte");
try {
	in = new BufferedInputStream(new FileInputStream(inFile));
	out = new BufferedOutputStream(new FileOutputStream(outFile));
	startTime = System.nanoTime();
	int byteRead;
	while((byteRead = in.read())!= -1) {
		out.write(byteRead);
	}
	elapsedTime = System.nanoTime()-startTime ;
	System.out.println("koha e exe: "+ elapsedTime/1000000000);
}catch(IOException e) {
	e.printStackTrace();
System.out.println("error");
	}
finally {
	try {
		if(in != null) {
			in.close();
		}
		if(out != null) {
			out.close();
		}
	}catch(IOException e) {
System.out.println("error");
e.printStackTrace();
}
	}
	}}
