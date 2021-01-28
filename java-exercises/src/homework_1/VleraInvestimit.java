/*Shkruani nje metode ne java qe te perllogaritni vleren e nje investimi ne te ardhmen, sipas nje
norme te percaktuar interesi, per nje numer te caktuar vitesh.*/
package homework_1;
public class VleraInvestimit {
public int vitet;
public double vleraInvestimit;
public double interesi;
public static double llogaritInvestimin(int vitet, double vleraInvestimit,double interesi ) {
	double shuma= (vitet *  (vleraInvestimit * (interesi/100))+vleraInvestimit);
	return shuma;
}
public static void main(String[] args) {
	System.out.println(llogaritInvestimin(2,1000,10));
}
}
