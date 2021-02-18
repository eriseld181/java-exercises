package methods;

public class IfConditions {

	public static void main(String[] args) {
		// if statement
		int y =3, x=5;
		if(x > y){
			int temp;
			temp = x;
			x = y;
			y = temp;
			}
		System.out.println("y: "+y+" x: "+x );
		//if else statement
		if (y < 0)
		System.out.println("Ky eshte nje numer negativ."); 
		else
		System.out.println("Ky eshte nje numer pozitiv.");
//if elseif else
		int temperatura = -5;
		if (temperatura < 0)
			System.out.println("Eshte ftohte.");
		else if (temperatura < 25)
			System.out.println("eshte mire.");
		else if (temperatura < 40)
			System.out.println("Ben vape.");
		else
			System.out.println("Shume vape.");
	}
	
}
