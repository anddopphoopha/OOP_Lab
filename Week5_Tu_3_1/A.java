package Week5_Tu_3_1;

public class A {
		public String str1 = "OhOh";
		private String str = "HaHa";

		private void display1() {
			System.out.println(str);
		}

		public void display2() {
			System.out.println(str);
		}

		public void display3() {
			display1();
		}

		public static void display4() {
			System.out.println("Hello World");
		}
	}
