package Week5_Tu_3_2;

public class A {
		public String str1 = "OhOh";
		public String str = "HaHa";//used to be private

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
