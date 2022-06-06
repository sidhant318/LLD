package chessBoard;

public class Board {
	
	Box[][] box;
	
	public Board() {
		box=new Box[8][8];
		initiateBoard();
	}

	private void initiateBoard() {
		box[0][0]=new Box(0,0,new Rook(true));
		box[0][7]=new Box(0,7,new Rook(true));
		box[0][1]=new Box(0,1,new Knight(true));
		box[0][6]=new Box(0,6,new Knight(true));
		box[0][2]=new Box(0,2,new Bishops(true));
		box[0][5]=new Box(0,5,new Bishops(true));
		box[0][3]=new Box(0,3,new King(true));
		box[0][4]=new Box(0,4,new Queen(true));
		
		box[1][0]=new Box(1,0,new Pawn(true));
		box[1][1]=new Box(1,1,new Pawn(true));
		box[1][2]=new Box(1,2,new Pawn(true));
		box[1][3]=new Box(1,3,new Pawn(true));
		box[1][4]=new Box(1,4,new Pawn(true));
		box[1][5]=new Box(1,5,new Pawn(true));
		box[1][6]=new Box(1,6,new Pawn(true));
		box[1][7]=new Box(1,7,new Pawn(true));
		
		box[7][0]=new Box(7,0,new Rook(false));
		box[7][7]=new Box(7,7,new Rook(false));
		box[7][1]=new Box(7,1,new Knight(false));
		box[7][6]=new Box(7,6,new Knight(false));
		box[7][2]=new Box(7,2,new Bishops(false));
		box[7][5]=new Box(7,5,new Bishops(false));
		box[7][3]=new Box(7,3,new King(false));
		box[7][4]=new Box(7,4,new Queen(false));
		
		box[6][0]=new Box(6,0,new Pawn(false));
		box[6][1]=new Box(6,1,new Pawn(false));
		box[6][2]=new Box(6,2,new Pawn(false));
		box[6][3]=new Box(6,3,new Pawn(false));
		box[6][4]=new Box(6,4,new Pawn(false));
		box[6][5]=new Box(6,5,new Pawn(false));
		box[6][6]=new Box(6,6,new Pawn(false));
		box[6][7]=new Box(6,7,new Pawn(false));
		
	}

}
