package chessBoard;

public class Queen extends Piece{

	public Queen(boolean color) {
		super(color);
	}

	@Override
	public boolean canMove(Box source, Box destination, Board board) {
		if(source.piece.isWhite()==destination.piece.isWhite()) {
			return false;
		}
		int x=Math.abs(source.xAxisPiecePosition-destination.xAxisPiecePosition);
		int y=Math.abs(source.yAxisPiecePosition-destination.yAxisPiecePosition);
		if(x+y==1) {
			return true;
		}
		if(x+y==2) {
			return true;
		}
		return false;
	}

}
