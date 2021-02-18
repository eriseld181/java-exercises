package homeworkcloningandstrings;
import java.util.Scanner;
 class Puntori{
	 
	 private int id;
	 private String name;
	 private double DiteAktive;
	 private double ditePushimi;
	 private double pagesa;
	 private double workingDays;
	 
	 Puntori(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiteAktive() {
		return DiteAktive;
	}

	public void setDiteAktive(double diteAktive) {
		DiteAktive = diteAktive;
	}

	public double getDitePushimi() {
		return ditePushimi;
	}

	public void setDitePushimi(double ditePushimi) {
		this.ditePushimi = ditePushimi;
	}
	
	public double getPagesa() {
		return pagesa;
	}

	public void setPagesa(double pagesa) {
		this.pagesa = pagesa;
	}

	public double getWorkingDays() {
		return workingDays;
	}

	public void setWorkingDays(double workingDays) {
		this.workingDays = workingDays;
	}
	public double  llogaritDitetAktive() {
		
			double DitetEPunesNeJave =getWorkingDays();
		
			//llogaris oret totale te punes ne nje vit,viti ka 52 jave
			//e mbledh me oret e mbetura te dites qe te dale puna ne dite
			double s = DitetEPunesNeJave*52 -getDitePushimi();
			return s;
		}
	public double  llogaritDitetEPushimit() {
	double p = getDitePushimi();
		double d = getDiteAktive();
		double s = p - d;
		return s;
	}
}
public class Data {
	private static Scanner in;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		// TODO Auto-generated method stub
		Puntori o = new Puntori();
		System.out.println("Vendosni emrin e puntorit, ditet e punes aktive ne jave, ditet e pushimit, "
				+ "pagesen e puntorit");
//		o.setName(in.next());
		o.setWorkingDays(in.nextDouble());
		o.setDitePushimi(in.nextDouble());
//		o.setPagesa(in.nextDouble());
		System.out.println(o.llogaritDitetAktive());
		
	

}}
