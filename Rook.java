package chessBoard;

public class Rook extends Piece{

	public Rook(boolean color) {
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
