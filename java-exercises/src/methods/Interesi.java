//Shkruani nj� program q� llogarit sasin� e interesit q� fitohet mbi nj� investim 
//prej 17.000$ dhe nj� p�rqindje interesi 0.027 p�r nj� vit.
package methods;

public class Interesi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double vlFillestare = 17000, 
				perqindjaInteresit = 0.027, 		
				interesi = vlFillestare* perqindjaInteresit;
		
				vlFillestare+=interesi;
				
				System.out.println("interesi eshte: "+interesi +"$");
				System.out.println("vl e investimit pas nje viti eshte: "+vlFillestare+"$");
			
		
		
	}

}
