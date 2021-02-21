//b�n p�rdorimin e k�tyre dy klasave p�r t�
//kopjuar nj� skedar hyrje n� nj� skedar dalje
//1- Shtojme ne main throws IOException
//2- Deklarojme FileInputStream dhe FileOutputStream.
//3- 
package filesInputOutputStreamsL8;

import java.io.*;

public class CopyFile {
	public static void main(String[] args) throws IOException {

		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("output.txt");
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);

			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}

	}
}
