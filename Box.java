package chessBoard;

public class Box {
	Piece piece;
	int xAxisPiecePosition;
	int yAxisPiecePosition;

	public Box(int xAxisPiecePosition,int yAxisPiecePosition,Piece piece) {
		this.xAxisPiecePosition=xAxisPiecePosition;
		this.yAxisPiecePosition=yAxisPiecePosition;
		this.piece=piece;
	}
}
