package chessBoard;

public class Bishops extends Piece{

	public Bishops(boolean color) {
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
