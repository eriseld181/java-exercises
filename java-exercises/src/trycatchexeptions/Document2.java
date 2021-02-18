package trycatchexeptions;

public class Document2 extends Building {
void color() throws NullPointerException{
	System.out.println("White");
}

public static void main(String[] args) {
	Document2 obj = new Document2();
	obj.color();
}
}