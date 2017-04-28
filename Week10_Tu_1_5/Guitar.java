package Week10_Tu_1_5;

public class Guitar extends StringInstrument {
	public Guitar(int strings) {
		super("Guitar", strings);
	}

	public Guitar() {
		super("Guitar", 4);
	}
	public void play(){
		System.out.println("Guitar with " + this.numberOfStrings + " strings");
	}
}
