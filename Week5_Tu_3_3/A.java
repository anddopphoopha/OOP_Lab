package Week5_Tu_3_3;

public class A {
		public String str1 = "OhOh";
		private String str = "HaHa";

		public void display1() {//used to private
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
