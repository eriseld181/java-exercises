package trycatchexeptions;
//e paperfunduar
public class TestUsingThrow {
static void checkEligibility(int stuAge, int stuWeight) {
//	System.out.println("metoda filloi");
	if(stuAge <= 32 && stuWeight <=40) {
		throw new ArithmeticException("studenti nuk pranohet");
		}else {
	System.out.println("personi  mund te vazhdoje shkollen");}
	return;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stuAge = 11;
		int stuWeight = 50;
		try {checkEligibility(stuAge,stuWeight );
			System.out.println("studenti futet ne mesim");
		}catch(Exception e) {
			System.out.println(" nuk futet");
		}
		
	}
		

	}


