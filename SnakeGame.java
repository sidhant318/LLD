package SnakeNokia;

import java.util.LinkedList;

public class SnakeGame {

	Snake snake;
	Board board;
	private boolean gameOver;
	SnakeDirectionOnBoard currentSnakeMovingPosition;

	public SnakeGame(Snake snake, Board board) {
		this.snake = snake;
		this.board = board;
		this.gameOver = false;
		this.currentSnakeMovingPosition = SnakeDirectionOnBoard.RIGHT;
	}

	public static void main(String[] args) {
		System.out.println("Going to start game");

		Cell initPosition = new Cell(0, 0);
		Snake initSnake = new Snake(initPosition);
		Board board = new Board(10);

		SnakeGame snakeGame = new SnakeGame(initSnake, board);
		snakeGame.startGame();

	}

	private void startGame() {
		while (isSafe(snake.getSnackBodyPosition())) {
			if (currentSnakeMovingPosition.equals(SnakeDirectionOnBoard.RIGHT.toString())) {
				moveRightPosition();
			} else if (currentSnakeMovingPosition.equals(SnakeDirectionOnBoard.LEFT.toString())) {
				moveLeftPosition();
			} else if (currentSnakeMovingPosition.equals(SnakeDirectionOnBoard.TOP.toString())) {
				moveTopPosition();
			} else {
				moveBottomPosition();
			}
		}
	}

//  01 02 03
//  01 02 03
	private void moveBottomPosition() {
		// TODO Auto-generated method stub

	}

	private void moveTopPosition() {
		// TODO Auto-generated method stub

	}

	private void moveLeftPosition() {
		// TODO Auto-generated method stub

	}

	private void moveRightPosition() {
		Cell snakeHead = getNextCell(snake.head);
		snake.addToSnakeBody(snakeHead);
		snake.getSnackBodyPosition().removeFirst();

	}

	private Cell getNextCell(Cell head) {
		System.out.println("Going to find next cell");
		int row = head.row;
		int col = head.col;

		if (this.currentSnakeMovingPosition == SnakeDirectionOnBoard.RIGHT) {
			col++;
		} else if (this.currentSnakeMovingPosition == SnakeDirectionOnBoard.LEFT) {
			col--;
		} else if (this.currentSnakeMovingPosition == SnakeDirectionOnBoard.TOP) {
			row--;
		} else if (this.currentSnakeMovingPosition == SnakeDirectionOnBoard.BOTTOM) {
			row++;
		}
		Cell nextCell = new Cell(row, col);
		return nextCell;
	}

	private boolean isSafe(LinkedList<Cell> allPositionOfSnake2) {
		int snakeSize = allPositionOfSnake2.size();
		Cell snakeHeadPosition = allPositionOfSnake2.get(snakeSize);
		if (snakeHeadPosition.row < board.sizeOfBoard || snakeHeadPosition.col < board.sizeOfBoard) {
			return true;
		}
		return false;
	}

}

class Board {
	int sizeOfBoard;
	Cell[][] snakeBoard;

	public Board(int sizeOfBoard) {
		this.sizeOfBoard = sizeOfBoard;
		snakeBoard = new Cell[this.sizeOfBoard][this.sizeOfBoard];
		// initialize();
	}

}

class Snake {
	private LinkedList<Cell> allPositionOfSnake = new LinkedList<>();

	Cell head;

	public Snake(Cell initPos) {
		head = initPos;
		allPositionOfSnake.add(head);
		head.setCellType(CellType.SNAKE_NODE);
	}

	void addToSnakeBody(Cell snakeBody) {
		allPositionOfSnake.add(snakeBody);
	}

	LinkedList<Cell> getSnackBodyPosition() {
		return allPositionOfSnake;
	}
}

enum SnakeDirectionOnBoard {
	RIGHT, LEFT, TOP, BOTTOM;
}

class Cell {
	public final int row, col;
	public CellType cellType;

	public Cell(int row, int col) {
		this.row = row;
		this.col = col;
	}

	public CellType getCellType() {
		return cellType;
	}

	public void setCellType(CellType cellType) {
		this.cellType = cellType;
	}
}

enum CellType {

	EMPTY, FOOD, SNAKE_NODE;
}
