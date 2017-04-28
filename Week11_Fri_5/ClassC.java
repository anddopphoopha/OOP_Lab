package Week11_Fri_5;

public class ClassC extends ClassA {
	private String str1 = "Hello World";

	public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}
	public void greet2(){
		System.out.println("GREET from C");
	}
	
	public void greet3(){
		super.greet3();
		System.out.println("GREET from C");
	}
}
