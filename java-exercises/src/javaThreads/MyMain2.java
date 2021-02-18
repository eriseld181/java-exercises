package javaThreads;
class PrintCount{
public void printCounter() {
	try{
		for(int i=0; i<6;i++) {
System.out.println("numri "+ i);
	}
		}catch(Exception e) {
			System.out.println("error");}
		}
}
class ThreadCounter extends Thread{
	private Thread t;
	private String threadName;
	PrintCount PC;
	ThreadCounter(String name, PrintCount pc){
threadName = name;
PC = pc; 
}
	public void run() {
//PC.printCounter();
		synchronized (PC) {
			PC.printCounter();
		}
System.out.println("thread "+ threadName + " po procesohet");
}
	public void start() {
		System.out.println("startPoint " + threadName);
		if(t==null) {
			t= new Thread(this, threadName);
			t.start();
		}
	}
}
public class MyMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PrintCount PC = new PrintCount();
ThreadCounter T1 = new ThreadCounter("thread counter1 ", PC);
ThreadCounter T2 = new ThreadCounter("thread counter2 ", PC);
ThreadCounter T3 = new ThreadCounter("thread counter3 ", PC);
ThreadCounter T4 = new ThreadCounter("thread counter4 ", PC);
T1.start();
T2.start();
T3.start();
T4.start();
try {
T1.join();
T2.join();
T3.join();
T4.join();
	}catch(Exception e) {
		System.out.println("error 2");}
	}

}
