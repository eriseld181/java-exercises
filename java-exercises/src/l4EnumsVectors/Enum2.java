package l4EnumsVectors;

public class Enum2 {
enum Dita{e_hene, e_marte, e_merkure, e_enjte, e_premte, e_shtune, e_djele}
enum Muaji{janar, shkurt, mars, prill, maj, qershor, korrik, gusht, shtator, tetor, nentor, dhjetor}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Dita fundjave = Dita.e_premte;
Muaji peshorja = Muaji.tetor;

System.out.println("Shenja ime eshte peshorja, meqenese une kam lindur ne "+peshorja +"." );
System.out.println("Ky eshte muaji i "+ (peshorja.ordinal()+1)+ ".");
System.out.println("Kenaqesi kur vjen dita "+fundjave + ".");

	}

}
