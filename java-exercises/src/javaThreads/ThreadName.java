package javaThreads;

public class ThreadName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Thread.currentThread().getName());
for(int i=0; i<10; i++) {
	new Thread (" "+ i) {
	public void run() {
	System.out.println("Thread "+ getName()+ " po proceson");
}}.start();
	}

	}}
