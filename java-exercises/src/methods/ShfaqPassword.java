//Shkruani nj� program q� p�rcakton dhe th�rret nj� metod� t� tipit void, 
//q� sh�rben p�r printimin e password-it. N�se password-i ka m� pak se 5 
//karaktere t� afishohet nj� mesazh ku thuhet q� mesazhi �sht� shum� i shkurt�r.
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
