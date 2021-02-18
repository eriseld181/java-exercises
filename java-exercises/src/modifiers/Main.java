package modifiers;
class Data{
	private String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Data d = new Data();
d.setName("Alban");
System.out.println(d.getName());
	}

}
