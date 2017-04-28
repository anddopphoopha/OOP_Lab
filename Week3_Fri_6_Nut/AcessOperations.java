package Week3_Fri_6_Nut;

public class AcessOperations {

	public static boolean verifyUsername(String[] dataBase, String input) {
		boolean temp = false;
		for (int i = 2; i < dataBase.length; i += +3) {
			if (input.equals(dataBase[i])) {
				temp = true;
			}
		}
		return temp;
	}
	
	public static String registerData(String userName,String password,String firstName,String lastName){
		String temp=firstName+","+lastName+","+userName+","+password;
				return temp;
	}

	public static boolean passwordVerify(String[] dataBase, String userName,String password){
	int locale=0;
	boolean temp=false;
		for(int i=2;i<dataBase.length;i+=3){
		if(dataBase[i].equals(userName)){
			locale=i+1;
		}
	}
	
	if(password.equals(dataBase[locale])){
		temp= true;
	}
	return temp;
}
}
