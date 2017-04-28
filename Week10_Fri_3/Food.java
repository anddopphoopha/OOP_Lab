package Week10_Fri_3;

public class Food extends Item {
	private int calories;
	
	public Food(String name, double price, double description, int calories){
		super(name, price, description);
		this.calories = calories;
	}


}
