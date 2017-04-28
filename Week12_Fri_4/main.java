package Week12_Fri_4;

import java.util.*;

public class main {
	public static void main(String args[]) {
		Caesar caesar = new Caesar(3);
		Substitution sub = new Substitution();
		SecuritySystem topSecurity = new SecuritySystem(caesar);
		SecuritySystem subSecurity = new SecuritySystem(sub);
		Scanner input = new Scanner(System.in);
		System.out.print("Input firstname: ");
		String firstname = input.next();
		System.out.print("Input lastname: ");
		String lastname = input.next();
		System.out.print("Input username: ");
		String username = input.next();
		System.out.print("Input password: ");
		String password = input.next();
		System.out.println(topSecurity.encryptUserInfo(firstname, lastname, username, password));
		System.out.println(subSecurity.encryptUserInfo(firstname, lastname, username, password));

	}
}
