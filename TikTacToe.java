package LLD;

import java.util.Arrays;
import java.util.Scanner;

public class TikTacToe {

	private final char board[][];
	private final int size;

	public TikTacToe(int size) {
		this.size = size;
		this.board = new char[size][size];
		this.boardFill();
	}

	private void boardFill() {
		for (int i = 0; i < size; i++) {
			Arrays.fill(board[i], '-');
		}

	}

	public static void main(String[] args) {
		TikTacToe toe = new TikTacToe(3);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lets Play Game: ");
		System.out.println("Player 1 , What is your name? ");
		String p1 = scanner.nextLine();
		System.out.println("Player 2 , What is your name? ");
		String p2 = scanner.nextLine();

		toe.startGame(p1, p2, scanner);

		toe.print();
	}

	private void startGame(String p1, String p2, Scanner scanner) {
		boolean player1 = true;
		boolean gameEnd = false;
		char chooseChar = '-';
		while (!gameEnd) {
			if (player1) {
				chooseChar = 'X';
			} else {
				chooseChar = 'O';
			}

			int row = 0;
			int col = 0;

			while (true) {
				System.out.println("Enter row number : ");
				row = scanner.nextInt();
				System.out.println("Enter Column number : ");
				col = scanner.nextInt();
				if (isSafe(row, col))
					break;
			}
			board[row][col]=chooseChar;
			char playerWon=playerHasWon();
			if(playerWon=='X') {
				System.out.println(p1 +"has won!!");
				gameEnd=true;
			}
			else if(playerWon=='O') {
				System.out.println(p2 +"has won!!");
				gameEnd=true;
			}
			else {
				if(boardIsFull()) {
					System.out.println("Game is Tie");
					gameEnd=true;
				}
				else {
					player1=!player1;
				}
			}
		}

	}

	

	private char playerHasWon() {
		
		for(int i=0;i<size;i++) {
			int p1Count=0;
			int p2Count=0;
			for(int j=0;j<size;j++) {
				if(board[i][j]=='X') {
					p1Count++;
				}
				else if(board[i][j]=='O'){
					p2Count++;
				}
			}
			if(p1Count==size)
				return 'X';
			else if(p2Count==size)
				return 'O';
		}
		
		for(int i=0;i<size;i++) {
			int p1Count=0;
			int p2Count=0;
			for(int j=0;j<size;j++) {
				if(board[j][i]=='X') {
					p1Count++;
				}
				else if(board[j][i]=='O'){
					p2Count++;
				}
			}
			if(p1Count==size)
				return 'X';
			else if(p2Count==size)
				return 'O';
		}
		return ' ';
	}
	
	
	private boolean boardIsFull() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if(board[i][j] !='-')
					return false;
			}
		}
		return true;
	}

	private boolean isSafe(int row, int col) {
		if (row < 0 || col < 0 || row >= size || col >= size) {
			System.out.println("Position is out of boundary");
		} else if (board[row][col] != '-') {
			System.out.println("Place is occupied");
		} else {
			return true;
		}
		return false;
	}

	private void print() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(board[i][j] + "  ");
			}
			System.out.println();
		}

	}

}
