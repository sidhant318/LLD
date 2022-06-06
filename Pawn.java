package chessBoard;

public class Pawn extends Piece{

	public Pawn(boolean color) {
		super(color);
	}

	@Override
	public boolean canMove(Box source, Box destination, Board board) {
		if(source.piece.isWhite()==destination.piece.isWhite()) {
			return false;
		}
		
		return false;
	}

}
