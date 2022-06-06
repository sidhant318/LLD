package chessBoard;

public abstract class Piece {
	private boolean killed=false;
	private boolean white=false;
	
	public Piece(boolean color) {
		this.white=color;
	}

	public boolean isKilled() {
		return killed;
	}

	public void setKilled(boolean killed) {
		this.killed = killed;
	}

	public boolean isWhite() {
		return white;
	}

	public void setWhite(boolean white) {
		this.white = white;
	}
	
	public abstract boolean canMove(Box source,Box destination,Board board);
	
	
}
