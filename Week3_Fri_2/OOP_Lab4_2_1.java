package Week3_Fri_2;

public class OOP_Lab4_2_1 {
	public static void main(String args[]) {
		String delim = ",";
		String testString = "one,two,three,four,five,six,seven";
		String[] token = testString.split(delim);
		for(int i = 0;i<token.length;i++){
		System.out.println(token[i]);
		}
		}
}
