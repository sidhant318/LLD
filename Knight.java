package chessBoard;

public class Knight extends Piece{

	public Knight(boolean color) {
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
