package Week10_Tu_1_5;

public class BassGuitar extends StringInstrument{
	public BassGuitar(int strings) {
		super("Bass Guitar", strings);
	}
	public BassGuitar(){
		super("Bass Guitar", 6);
	}
	public void play(){
		System.out.println("Bass Guitar with " + this.numberOfStrings + " strings");
	}
	
}
