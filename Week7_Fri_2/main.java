package Week7_Fri_2;

public class main {
	public static void main(String args[]) {
		tictac game = new tictac(4);
		game.printBoard();
		game.placeMark(0, 0);
		game.placeMark(1, 1);
		game.placeMark(2, 2);
		game.placeMark(3, 3);
		game.printBoard();
		System.out.println(game.checkForWin());
		System.out.println(game.getPlayer());
	}
}
