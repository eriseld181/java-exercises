package filesInputOutputStreamsL8;
import java.io.*;
public class Tekst2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String inFileStr = "filename.txt";
String outFileStr = "example.txt";
BufferedInputStream in = null;
BufferedOutputStream out = null;
long startTime, elapsedTime;

//check file length
File fileIn = new File(inFileStr);
System.out.println("file size is: "+fileIn.length()+" in bytes. ");

try {
	in = new BufferedInputStream(new FileInputStream(inFileStr));
	out = new BufferedOutputStream(new FileOutputStream(outFileStr));
	startTime = System.nanoTime();
	int byteRead;
	while((byteRead = in.read())!= -1) {
		out.write(byteRead);
	}
	elapsedTime = System.nanoTime();
	System.out.println("Elapsed Time is " +
			(elapsedTime / 1000000.0) + " msec");
	
}catch(IOException e) {
	e.printStackTrace();
	System.out.println("error");
}finally {
	try {
		if(in !=null) {
		in.close();
	}
	
	if(out != null) {
		out.close();
	}
	}catch(IOException e) {
		e.printStackTrace();
	}
}
	}

}
