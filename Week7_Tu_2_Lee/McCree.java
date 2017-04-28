package Week7_Tu_2_Lee;

import java.util.ArrayList;
import java.util.Random;

public class McCree {
	ArrayList<String> obj = new ArrayList<String>();
	Random rand = new Random();

	public McCree() {

	}

	public int getsize() {
		return obj.size();
	}

	public void Loadlead(int a) {
		for (int i = 0; i < a; i++) {
			obj.add("lead");
		}
	}

	public void Loadgold(int b) {
		for (int i = 0; i < b; i++) {
			obj.add("gold");
		}
	}

	public void Loadplasma(int c) {
		for (int i = 0; i < c; i++) {
			obj.add("plasma");
		}
	}
    public int random(){
    	return  rand.nextInt(2)+0;
    }
	public void Shoot() {
		if (obj.size() == 0) {
			System.out.println("There is no bullet");
		} else {
			if(random()==0) {
				System.out.println("it's high noon");
			}
			System.out.println(checkbullet(obj.get(0)));
			obj.remove(0);
		}
	}

	public String checkbullet(String a) {
		if (a.equals("lead")) {
			return "Lead Bullet is used !!!!";
		} else if (a.equals("gold")) {
			return "gold Bullet is used !!!!";
		} else if (a.equals("plasma")) {
			return "Plasma Bullet is used !!!!";
		} else {
			return "error occured";
		}
	}

}
