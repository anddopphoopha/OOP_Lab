package Week9_Fri_4_2;

public class Zerg extends Races {
	protected int additionHeal;
	public Zerg() {
		super(150, 25);
	}

	public void setHeal(int setHeal) {
		super.restorationRate += setHeal;
	}
}
