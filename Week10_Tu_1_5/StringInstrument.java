package Week10_Tu_1_5;

public abstract class StringInstrument {
	protected String name;
	protected int numberOfStrings;

	public StringInstrument(String name, int numberOfStrings) {
		this.name = name;
		this.numberOfStrings = numberOfStrings;
	}

	public StringInstrument() {

	}

	public abstract void play();
}
