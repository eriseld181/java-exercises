package methods;

public class LlogaritjeKohe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long kohaFillestare,kohaPerfundimare;
		double koha;
		
		kohaFillestare = System.currentTimeMillis();
		double gjeresia, gjatesia, hipotenuza;
		gjeresia = 42.00;
		gjatesia = 17.00;
		
		hipotenuza = Math.sqrt(gjeresia *gjeresia + gjatesia *gjatesia);
		System.out.println("Nje trekendesh me brinje "+gjeresia
				+" dhe "+gjatesia +" ka hipotenuzen: "+hipotenuza);
		System.out.println("\nky eshte nje numer i rastit "+ Math.random());
		System.out.println("\npi= "+ Math.PI);
		kohaPerfundimare = System.currentTimeMillis();
		koha = (kohaPerfundimare - kohaFillestare)/1000;
		System.out.println("koha e exe: "+koha);



	}

}
