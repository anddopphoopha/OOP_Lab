package Week3_Fri_6_Nut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int testfunc = 0;
		String[] store;
		store = ReadProcess.readFile();
		System.out.println("What would you like to do?\n1)Registration \n2Login)");
		testfunc = input.nextInt();
		if (testfunc == 1) {
			System.out.println("Please input the username:");
			String userName = input.next();
			if (AcessOperations.verifyUsername(store, userName)) {
				System.out.println("Sorry, this username is already taken.");
			} else {
				System.out.print("Username is available. \nPlease input the password: ");
				String password = input.next();
				System.out.print("\nPlease input first name: ");
				String firstName = input.next();
				System.out.print("\nPlease input last name: ");
				String lastName = input.next();
				String output = AcessOperations.registerData(userName, password, firstName, lastName);
				WriteProcess.writeTo(output);
				System.out.println("Registration complete, the program will now terminate.");
			}

		} else if (testfunc == 2) {
			int falsePass=0;
			System.out.println("Please input the username:");
			String userName = input.next();
			if (AcessOperations.verifyUsername(store, userName)) {
				while(falsePass<3){
				System.out.println("Please enter the password: ");
				String password=input.next();
				if(AcessOperations.passwordVerify(store, userName, password))
				{
					System.out.print("Welcome!");
					break;
					
				}
				else{
					falsePass++;
					System.out.println("Incorrect Password entered. Attempt("+falsePass+"/3)");
					
					}
				}
				if(falsePass==3){
					System.out.println("Too many incorrect password attempt. Program terminating...");
				}
			}
		}
		}
	}

