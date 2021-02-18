package mypolimorfizm;

public class Punonjes extends Member{
//	super(emri, paga);
public String specializimi;
public String deparatamenti;
public Punonjes{
	String specializimi = this.specializimi;
}
public static void main(String[] args) {
	Punonjes emri = new Punonjes();
	emri.setEmri("eriseld");
}
}
