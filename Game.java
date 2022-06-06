package chessBoard;

import java.util.Scanner;

public class Game {
	
	Player[] players;
	Board board;
	Player currentTurn;
	
	Game(){
		players= new Player[]{new Player("p1", true),new Player("p2", false)};
		board=new Board();
		currentTurn=players[0];
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Game game=new Game();
		game.startGame(scanner);

	}

	private void startGame(Scanner scanner) {
		boolean gameEnd = false;
		while(!gameEnd) {
			int sourceRowPositionOfPiece = 0;
			int sourceColumnPositionOfPiece = 0;
			int destinationRowPositionOfPiece = 0;
			int destinationColumnPositionOfPiece = 0;
			int val=0;
			System.out.println("Enter your Piece Row and Column Position");
			val=scanner.nextInt();
			sourceColumnPositionOfPiece=val%10;
			sourceRowPositionOfPiece=val/10;
			System.out.println("Enter shifted Row and Column Position");
			val=scanner.nextInt();
			destinationColumnPositionOfPiece=val%10;
			destinationRowPositionOfPiece=val/10;
			
			Box Source=board.box[sourceRowPositionOfPiece][sourceColumnPositionOfPiece];
			Box destination=board.box[destinationRowPositionOfPiece][destinationColumnPositionOfPiece];
			move(currentTurn,Source,destination);
			if(this.currentTurn==players[0]) {
				this.currentTurn=players[1];
			}else {
				this.currentTurn=players[0];
			}
		}
		
	}

	private void move(Player currentTurn2, Box source, Box destination) {
		Piece piece=source.piece;
		if(piece.canMove(source, destination, board)) {
			Piece destPiece=destination.piece;
			if(destPiece!=null) {
				destPiece.setKilled(true);
			}
			destination.piece=piece;
			source.piece=null;
		}
	}

}
