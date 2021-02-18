package homework_try_catch_exceptions;
import java.util.*;
public class CheckIn {
public static void Luggage (double weight)throws WeightLimitExcended{
	if(weight> 15) {
throw new WeightLimitExcended(weight);
}
}
public static void main(String[] args)  {
	double extraPay = 0;
	double extraWeight =0;
	// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
try {
	
System.out.println("Put the weight of Traveler's Luggage ");
double weight = in.nextDouble();
if(weight>15) {
	for(int i=15; i< weight; i++) {
		extraWeight++;
		extraPay= extraWeight*10;
	}
	}
	Luggage(weight);
System.out.println("You can go to the gate!");
System.out.println("No extra fees are applied!");

} catch(WeightLimitExcended e){
System.out.println("you need to pay extra " + extraPay+"$ "+ "because your luggage has "+ extraWeight +"kg more than the max limit");
}
}

}