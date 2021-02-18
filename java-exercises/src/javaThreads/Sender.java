package javaThreads;
class Send{
	public void send(String message) {
		System.out.println("Mesazhi u dergua  "+ message);
try {
	Thread.sleep(1000);
}
catch(Exception e) {
System.out.println("nderpre");
	}
System.out.println(message+" Dergua!");
}
	
class ThreadSend extends Thread{
	private String message;
	Send S;
	ThreadSend(String m, Send s){
		message = m;
		S=s;
	}
	public void run() {
		synchronized (S){
			S.send(message);
		
		}
	}
}	
}
public class Sender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Send snd = new Send();
		
		ThreadSend S1 = new ThreadSend("hello", snd);
		ThreadSend S2 = new ThreadSend("bye", snd);
S1.start();
S2.start();
	try {
		S1.join();
		S2.join();
	}catch(Exception e) {
System.out.println("error");
	}

}
}