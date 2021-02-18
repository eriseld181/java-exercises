
public class Customer {
private int id = 0;
private String name= "";
private int discount = 0;

Customer(int id, String name, int discount){
	id = this.id;
	name= this.name;
	discount = this.discount;
}

public String getName() {
	return name;
}

public int getDiscount() {
	return discount;
}

public void setDiscount(int discount) {
	this.discount = discount;
}

public int getId() {
	return id;
};
//to String

}
