package Week12_Fri_3;

import java.util.*;

public class main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input firstname: ");
		String firstname = input.next();
		System.out.print("Input lastname: ");
		String lastname = input.next();
		System.out.print("Input username: ");
		String username = input.next();
		System.out.print("Input password: ");
		String password = input.next();
		SecuritySystem topSecurity = new SecuritySystem();
		System.out.println(topSecurity.encryptUserInfo(firstname, lastname, username, password));
	}
}
