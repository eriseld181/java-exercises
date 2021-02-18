package trycatchexeptions;

public class TestExeptions {
	static void myMethod(int testnum)throws Exception{
		System.out.println("Start of myMethod");
		if(testnum ==12)
			throw new Exception();
		System.out.println("end of myMethod");
	}
	public static void main(String[] args) {
		int testnum = 12;
		try {
			System.out.println("try-first statement");
			//myMethod(testnum);
			System.out.println("try-last statement");//is not in display because it 
			//was activated a new exception from myMethod
		}catch(Exception e){
			System.out.println("Any exception");
		}finally {
			System.out.println("finally ");
		}
		System.out.println("Out of try/catch/finally - statement");
	}
	
	
//static void metoda(int testNr)throws Exception{
//	System.out.println("metoda filloi");
//	if(testNr == 12) 
//		throw new Exception();
//		System.out.println("perfundo metoden");
//		return;
//	
//}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int testNr = 12;
//		try {
//			metoda(testNr);
//			System.out.println("afishimi i vleres se metodes");
//		}
//		catch(Exception e) {
//			System.out.println("ndodhi nje -perjashtim");
//		}
//		finally{
//			System.out.println("vlera ishte ajo qe u perjashtua");
//		}
//		System.out.println("perfundoi try-catch-finally");
//	}

}
