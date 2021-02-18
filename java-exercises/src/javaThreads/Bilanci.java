package javaThreads;
class Account{
	public double balanca;
	public int nrLlogarise;
	public void Balanca() {
System.out.println("nrLlogarise "+ nrLlogarise +" balanca"+ balanca);
}
	synchronized void depozitim(double shuma) {
		balanca = balanca+shuma;
		System.out.println(shuma +" u shtua ne llogari");
		Balanca();
	}
	synchronized void terheqje(double shuma) {
		balanca = balanca+shuma;
		System.out.println(shuma +" sqe u hoq ne llogari");
		Balanca();
	}
}
class DepoziteTransaksjoni implements Runnable {
	double shuma;
	Account A;
	DepoziteTransaksjoni(double shuma, Account a){
		this.shuma=shuma;
		A = a;
		new Thread(this).start();
	}
	public void run() {
		A.depozitim(shuma);
		
	}
	class TransaksjonTerheqje implements Runnable{
		double shuma;
		Account A;
		TransaksjonTerheqje(double shuma, Account a){
			this.shuma=shuma;
			A = a;
			new Thread(this).start();
		}
		public void run() {
			A.terheqje(shuma);
}}}
public class Bilanci {

	public static void main(String[] args) {
Account a = new Account();
a.balanca = 2000;
a.nrLlogarise = 1234;
DepoziteTransaksjoni dt;
TransaksjonTerheqje tt;
dt = new DepoziteTransaksjoni(30000, a);
tt = new TransaksjonTerheqje( 1000, a);

	}

}
