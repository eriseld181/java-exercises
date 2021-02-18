package imputOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class kopjofile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream in = null;
FileOutputStream out = null;
try {
	in = new FileInputStream("filename.txt");
	out= new FileOutputStream("filename.txe");
	int a;
	while((a= in.read())!=-1) {
		out.write(a);
	}
}finally {
	if(in!=null) {
in.close();

}
	if(out!=null) {
out.close();

}
	}

}}
