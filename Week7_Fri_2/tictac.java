package Week7_Fri_2;

public class tictac {

	private char[][] board;
	private char currentPlayerMark;
	private int size;

	public tictac(int size) {
		board = new char[size][size];
		this.size = size;
		currentPlayerMark = 'o';
		initializeBoard();
	}

	public void initializeBoard() {

		for (int i = 0; i < this.size; i++) {

			for (int j = 0; j < this.size; j++) {
				board[i][j] = '-';
			}
		}
	}

	public void printBoard() {
		System.out.println();

		for (int i = 0; i < this.size; i++) {
			System.out.print("| ");
			for (int j = 0; j < this.size; j++) {
				System.out.print(board[i][j] + " | ");
			}
			System.out.println();
			System.out.println();
		}
	}

	public boolean isBoardFull() {
		boolean isFull = true;

		for (int i = 0; i < this.size; i++) {
			for (int j = 0; j < this.size; j++) {
				if (board[i][j] == '-') {
					isFull = false;
				}
			}
		}

		return isFull;
	}

	public boolean checkForWin() {
		return (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin());
	}

	private boolean checkRowsForWin() {
		if (checkRow() == true) {
			return true;
		}
		return false;
	}

	private boolean checkColumnsForWin() {
		if (checkCol() == true) {
			return true;
		}
		return false;
	}

	private boolean checkDiagonalsForWin() {
		return ((checkDiagonalLeft() == true) || (checkDiagonalRight() == true));
	}

	private boolean checkCol() {
		int count = 0;
		for (int i = 0; i < this.size; i++) {
			for (int j = 1; j < this.size; j++) {
				if (board[j][i] == board[j - 1][i] && (board[i][j] != '-')) {
					count++;
					if (count == this.size) {
						return true;
					}
				}
			}
		}
		return false;
	}

	private boolean checkRow() {
		int count = 0;
		for (int i = 0; i < this.size; i++) {
			for (int j = 1; j < this.size; j++) {
				if (board[i][j] == board[i][j - 1] && (board[i][j] != '-')) {
					count++;
					if (count == this.size - 1) {
						return true;

					}
				}
			}
		}
		return false;
	}

	private boolean checkDiagonalLeft() {
		int count = 0;
		int j = 0;
		for (int i = 0; i < this.size; i++) {
			if (j + 1 != this.size && i + 1 != this.size) {
				if (board[i][j] == board[i + 1][j + 1] && (board[i][j] != '-')) {
					count++;
					if (count == this.size - 1) {
						return true;
					}
				}
				j++;
			}
		}
		return false;

	}

	private boolean checkDiagonalRight() {
		int count = 0;
		int j = this.size - 1;
		for (int i = 0; i < this.size; i++) {
			if (i + 1 != this.size && j + 1 != this.size) {
				if (board[i][j] == board[i + 1][j - 1] && (board[i][j] != '-')) {
					count++;
					if (count == this.size - 1) {
						return true;
					}
				}
				j++;
			}
		}
		return false;

	}

	public void changePlayer() {
		if (currentPlayerMark == 'x') {
			currentPlayerMark = 'o';
		} else {
			currentPlayerMark = 'x';
		}
	}

	public char getPlayer() {
		return currentPlayerMark;
	}

	public boolean placeMark(int row, int col) {
		if ((row >= 0) && (row < this.size)) {
			if ((col >= 0) && (col < this.size)) {
				if (board[row][col] == '-') {
					board[row][col] = currentPlayerMark;
					return true;
				}
			}
		}

		return false;
	}
}