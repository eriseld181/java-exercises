//Shkruani një program që përcakton dhe thërret një metodë të tipit void, 
//që shërben për printimin e password-it. Nëse password-i ka më pak se 5 
//karaktere të afishohet një mesazh ku thuhet që mesazhi është shumë i shkurtër.
package methods;

public class ShfaqPassword {
static void password(String pass){
	System.out.println("Password: "+ pass);
	if(pass.length() >= 5)
		return;
	System.out.println("Password shume i shkurter!");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
password("eris");
password("eriseld");
password("er");
	}

}
