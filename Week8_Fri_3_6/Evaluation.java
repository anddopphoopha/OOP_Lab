package Week8_Fri_3_6;

public class Evaluation {
	private int choice = 6;
	private String grade;

	public void getChoice(double score) {
		if (score <= 100) {
			if (score > 79)
				this.choice = 1;
			else if (score > 69)
				this.choice = 2;
			else if (score > 59)
				this.choice = 3;
			else if (score > 49)
				this.choice = 4;
			else if (score >= 0)
				this.choice = 5;
		}
	}

	public void evaluateGrade() {
		switch (choice) {
		case 1:
			grade = "A";
			break;
		case 2:
			grade = "B";
			break;
		case 3:
			grade = "C";
			break;
		case 4:
			grade = "D";
			break;
		case 5:
			grade = "F";
			break;
		default:
			grade = "Invalid input";
			break;
		}
	}

	public String getGrade() {
		return this.grade;
	}
}
