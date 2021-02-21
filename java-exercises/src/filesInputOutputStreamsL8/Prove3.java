package filesInputOutputStreamsL8;
import java.io.*;
import java.util.ArrayList;
public class Prove3 implements Serializable{
	private String Emri;
	private String Mbiemri;
	private int Ditelindja;
	
	public Prove3(String Emri, String Mbiemri, int
			Ditelindja) {
			this.Emri = Emri;
			this.Mbiemri = Mbiemri;

			this.Ditelindja = Ditelindja;
			}

			@Override
			public String toString() {
			return "Person{" +
			"Emri='" + Emri + '\'' +
			", Mbiemri='" + Mbiemri + '\'' +
			", Ditelindja=" + Ditelindja +
			"}\n";
			}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prove3 p1 = new Prove3("Anxhela", "B", 1980);
		Prove3 p2 = new Prove3("Ana", "C", 1990);
		Prove3 p3 = new Prove3("Beni", "D", 1995);
		ArrayList<Prove3> individ = new ArrayList<>();
		individ.add(p1);
		individ.add(p2);
		individ.add(p3);
		//write to file
		try{
		FileOutputStream writeData = new
		FileOutputStream("individ.txt");

		ObjectOutputStream writeStream = new
		ObjectOutputStream(writeData);

		writeStream.writeObject(individ);
		writeStream.flush();
		writeStream.close();

		}catch (IOException e) {
		e.printStackTrace();
		}

		try{
		FileInputStream readData = new
		FileInputStream("individ.ser");
		ObjectInputStream readStream = new
		ObjectInputStream(readData);

		ArrayList individ2 = (ArrayList<Prove3>)
		readStream.readObject();
		readStream.close();

		System.out.println(individ2.toString());
		}catch (IOException | ClassNotFoundException e) {
		e.printStackTrace();
		}
		}
	}


