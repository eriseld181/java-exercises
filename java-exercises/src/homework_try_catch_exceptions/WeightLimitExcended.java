package homework_try_catch_exceptions;

public class WeightLimitExcended extends Exception {
public WeightLimitExcended(double weight) {
	System.out.println("Your Luggage Has Reached max limit!");
}
}
