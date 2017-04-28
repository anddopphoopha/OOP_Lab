package Week9_Fri_4_2;

public class Main {
	public static void main(String args[]) {
		Zerg one = new Zerglings();
		one.PrintInformation();
		System.out.println(one.health);
		one.setDamage(151);
		System.out.println(one.health);
		System.out.println(one.calRestoration(3, 50) + "\n");

		Protoss two = new Zealot();
		two.PrintInformation();
		System.out.println(two.health);
		System.out.println(two.shields);
		two.setDamage(180);
		System.out.println(two.health);
		System.out.println(two.shields);
		System.out.println(two.calRestoration(4, 170) + "\n");

		Terran three = new Marines();
		three.PrintInformation();
		System.out.println(three.health);
		three.setDamage(10);
		System.out.println(three.health);
		System.out.println(three.calRestoration(2, 70)  + "\n");
	}
}
