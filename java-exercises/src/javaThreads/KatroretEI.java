package javaThreads;
class LlogaritKatrorin{
public synchronized void llogarit(int numri) {
	
		int katrori = numri*numri;
		katrori++;
		System.out.println(katrori);
	}
}
public class KatroretEI extends Thread{
	Thread t1;
	Thread t2;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LlogaritKatrorin k1 = new LlogaritKatrorin();
		k1.llogarit(4);
	}

}
