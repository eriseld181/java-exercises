package trycatchexeptions;

public class ParentDocument extends Parent{
	
	void msg()throws ArithmeticException{
		System.out.println("child");
	}
public static void main(String[] args) {
Parent p = new ParentDocument();
p.msg();
}
}
