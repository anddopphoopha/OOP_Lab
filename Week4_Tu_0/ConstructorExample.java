package Week4_Tu_0;

public class ConstructorExample {
		private String name;

		// constructor 1
		public ConstructorExample() {
			this.name = "nothing";
			System.out.println("Default constructor is called");
		}

		// constructor 2
		public ConstructorExample(String name) {
			this.name = name;
			System.out.println("Parameterized constructor is called");
		}

		public String getName() {
			return this.name;
		}
	}

