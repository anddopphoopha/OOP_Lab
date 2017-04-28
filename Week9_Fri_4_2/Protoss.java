package Week9_Fri_4_2;

public class Protoss extends Races {
	protected int shields;
	protected int shieldRestoration;
	protected int maxShields;//Cannot be assigned final if it is not declared in constructor

	public Protoss() {
		super(200, 0);
	}

	public void setShields(int shields) {
		this.shields = shields;
		this.maxShields = shields;
	}

	public void setDamage(int damage) {
		if (shields <= 0)
			this.health -= damage;
		else if (damage > shields) {
			shields -= damage;
			this.health += shields;
			shields = 0;
		} else
			shields -= damage;
	}

	public int calRestoration(int restorationTime, int shields) {
		int temp = restorationTime * (this.shieldRestoration) + shields;
		if (temp > this.maxShields) {
			temp = this.maxShields;
		}
		return temp;
	}

	public void setRestoration(int shieldRestoration) {
		this.shieldRestoration = shieldRestoration;
	}
}
