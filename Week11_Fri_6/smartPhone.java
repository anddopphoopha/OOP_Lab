package Week11_Fri_6;

public class smartPhone extends cellPhone {
	public void display() {
		if(this instanceof smartPhone){
			System.out.println("Smart Phone");
		}
	}
	
	public static void main(String args[]){
		cellPhone one = new smartPhone();
		cellPhone two = new cellPhone();
		one.display();
		two.display();
	}
}
