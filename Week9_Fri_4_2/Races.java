package Week9_Fri_4_2;

public class Races {
	protected int health;
	protected int restorationRate;
	protected final int maxHealth;

	public Races(int health, int restorationRate) {
		this.health = health;
		this.restorationRate = restorationRate;
		this.maxHealth = health;
	}

	public void PrintInformation() {
		System.out.println(this.getClass().getSimpleName() + " and " + this.getClass().getSuperclass().getSimpleName());
	}

	public void setDamage(int damage) {
		if (damage > this.health) {
			this.health = 0;
		} else
			this.health -= damage;
	}

	public int calRestoration(int restorationTime, int health) {
		int temp = restorationTime * (this.restorationRate) + health;
		if (temp > this.maxHealth) {
			temp = this.maxHealth;
		}
		return temp;
	}

}
