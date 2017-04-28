package Week7_Tu_2_Lee;

import java.util.*;

public class Test_McCree {
	public static void main(String[] args) {
		McCree obmc = new McCree();
		Scanner input = new Scanner(System.in);
		Boolean checker = true;
		while (checker) {
			System.out.println("McCree Ability");
			System.out.println("****************************************");
			System.out.println("1 Shoot" + '\n' + "2 Reload" + '\n' + "0 Exit");
			System.out.println("****************************************");
			int choice = input.nextInt();
			if (choice == 1) {
				obmc.Shoot();
			} else if (choice == 2) {
				System.out.println("How many bullets you want to load: ");
				int count = input.nextInt();
				int[] arr = new int[count];
				if (count > 5) {
					System.out.println("exceedd bullets");
				} else {
					System.out.println("(1) for lead bullet (2) for gold bullet (3) for plasma bullet ");

					for (int i = 0; i < count; i++) {
						int a = input.nextInt();
						arr[i] = a;

					}
					for (int j = 0; j < arr.length; j++) {
						if (arr[j] == 1) {
							obmc.Loadlead(1);
						} else if (arr[j] == 2) {
							obmc.Loadgold(1);
						} else if (arr[j] == 3) {
							obmc.Loadplasma(1);
						}
					}
				}

			} else if (choice == 0) {
				checker = false;
				System.exit(0);
			}

		}
	}
}
