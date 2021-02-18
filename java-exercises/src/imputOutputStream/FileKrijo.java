package imputOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileKrijo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Path fileName = Path.of("eriseld.txt");
		String content = "Leksjoni IO Stream";
		Files.writeString(fileName, content);
		String actual = Files.readString(fileName);
		System.out.println(actual);
	}

}
