package Week5_Fri_1;

public class OOP_Lab8_1 {
	public static void main(String[] args) {
		NerfGun gun1 = new NerfGun();
		gun1.fire();
		gun1.reload(15);
		gun1.fire();
		gun1.fire();
		gun1.displayNumOfAmmunition();
		gun1.reload(2);
		gun1.displayNumOfAmmunition();
		gun1.displayGunID();
		NerfGun gun2 = new NerfGun(15);
		gun2.displayGunID();
		gun2.fire();
		gun2.displayNumOfAmmunition();
		gun2.reload(2);
		gun2.displayNumOfAmmunition();
	}
}
