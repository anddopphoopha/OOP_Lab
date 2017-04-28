package Week3_Fri_2;

public class StringTokenizer {
	public static void main(String args[]) {
		String delim = " ";
		String testString = "Nothing ventured, nothing gained.";
		String[] token = testString.split(delim);
		for(int i = 0;i<token.length;i++){
		System.out.println(token[i]);
		}
		}
}
