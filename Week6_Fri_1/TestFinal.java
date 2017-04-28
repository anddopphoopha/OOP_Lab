package Week6_Fri_1;

public class TestFinal {
	public final String GREETING = "Sawasdee";
	private static final int SIZEOFARRAY = 10;
	public static final String GREETING2 = "Hello";

	// line a
	public static void main(String[] args) {
		TestFinal myObj = new TestFinal();
		final double PI = 3.14;
		final String MYFIRSTNAME = "Andrew";
		final int MYAGE = 16;
		//myObj.GREETING = "Hi !!!!!!!!"; // line 01
		//TestFinal.SIZEOFARRAY = 100; // line 02
		//PI = 100.0; // line 03
		System.out.println(myObj.GREETING);
		System.out.println(TestFinal.SIZEOFARRAY);
		System.out.println(PI);
		// line b
		displayStr(GREETING2);
		displayStr("Konnichiwa");
	}
	
	public static void displayStr (final String text){
		System.out.println(text);
		//line c
		//text = "55555";
		}
}
