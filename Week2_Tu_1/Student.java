package Week2_Tu_1;

public class Student {
	String studentID;
	String name;
	int score;

	public Student(String a, String b, int c) {
		name = a;
		studentID = b;
		score = c;

	}

	void printScore() {
		System.out.println("Score of " + studentID + " : " + name + " is " + score);
	}

	String compareScore(Student otherStudent) {
		if (otherStudent.score < this.score) {
			return this.name;
		} else {
			return otherStudent.name;
		}
	}

	void fightClub(Student a) {
		if (this.score == a.score) {
			System.out.println(this. name + " & " + a.name + " are rivals");
		} else if (this.score < a.score) {
			System.out.println(this.name + " must regain his honor. " + this.name + ", you must battle " + a.name);
		} else
			System.out.println(a.name + " must regain his honor. " + a.name + ", you must battle " + this.name);
	}
}
