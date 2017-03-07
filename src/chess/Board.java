package chess;

public class Board {

	private static final int BOARD_WIDTH = 8;
	private static final int BOARD_HEIGHT = 8;
	private Figure[][] board;

	public Board() {
		this.board = new Figure[BOARD_HEIGHT][BOARD_WIDTH];
		putFiguresOnBoard();
	}

	public void putFiguresOnBoard() {
		putPawnsOnBoard();
		putBishopsOnBoard();
		putHorsesOnBoard();
		putRooksOnBoard();
		putQueensOnBoard();
		putKingsOnBoard();
		printBoard();
	}

	private void putKingsOnBoard() {
		King king1 = new King(Figure.getBlackPlayer(), King.getBlackKingSymbol());
		King king2 = new King(Figure.getBlackPlayer(), King.getWhiteKingSymbol());
		board[4][0] = king1;
		board[4][7] = king2;

	}

	private void putQueensOnBoard() {
		Queen queen1 = new Queen(Figure.getBlackPlayer(), Queen.getBlackQueenSymbol());
		Queen queen2 = new Queen(Figure.getBlackPlayer(), Queen.getWhiteQueenSymbol());
		board[3][0] = queen1;
		board[3][7] = queen2;
	}

	private void putRooksOnBoard() {
		putBlackRooksOnBoard();
		putWhiteRooksOnBoard();

	}

	private void putWhiteRooksOnBoard() {
		Rook rook3 = new Rook(Figure.getBlackPlayer(), Rook.getWhiteRookSymbol());
		Rook rook4 = new Rook(Figure.getBlackPlayer(), Rook.getWhiteRookSymbol());
		board[0][7] = rook3;
		board[7][7] = rook4;
	}

	private void putBlackRooksOnBoard() {
		Rook rook1 = new Rook(Figure.getBlackPlayer(), Rook.getBlackRookSymbol());
		Rook rook2 = new Rook(Figure.getBlackPlayer(), Rook.getBlackRookSymbol());
		board[0][0] = rook1;
		board[7][0] = rook2;
	}

	private void putHorsesOnBoard() {
		putBlackHorsesOnBoard();
		putWhiteHorsesOnBoard();
	}

	private void putWhiteHorsesOnBoard() {
		Horse horse3 = new Horse(Figure.getBlackPlayer(), Horse.getWhiteHorseSymbol());
		Horse horse4 = new Horse(Figure.getBlackPlayer(), Horse.getWhiteHorseSymbol());
		board[1][7] = horse3;
		board[6][7] = horse4;
	}

	private void putBlackHorsesOnBoard() {
		Horse horse1 = new Horse(Figure.getBlackPlayer(), Horse.getBlackHorseSymbol());
		Horse horse2 = new Horse(Figure.getBlackPlayer(), Horse.getBlackHorseSymbol());
		board[1][0] = horse1;
		board[6][0] = horse2;
	}

	private void putBishopsOnBoard() {
		putBlackBishopsOnBoard();
		putWhiteBishopsOnBoard();

	}

	private void putBlackBishopsOnBoard() {
		Bishop bishop1 = new Bishop(Figure.getBlackPlayer(), Bishop.getBlackBishopSymbol());
		Bishop bishop2 = new Bishop(Figure.getBlackPlayer(), Bishop.getBlackBishopSymbol());
		board[2][0] = bishop1;
		board[5][0] = bishop2;
	}

	private void putWhiteBishopsOnBoard() {
		Bishop bishop3 = new Bishop(Figure.getWhitePlayer(), Bishop.getWhiteBishopSymbol());
		Bishop bishop4 = new Bishop(Figure.getWhitePlayer(), Bishop.getWhiteBishopSymbol());
		board[2][7] = bishop3;
		board[5][7] = bishop4;
	}

	public void putPawnsOnBoard() {
		putBlackPawnsOnBoard(); // up
		putWhitePawnsOnBoard(); // down
	}

	private void putWhitePawnsOnBoard() {
		for (int i = 0; i < board.length; i++) {
			Pawn pawn = new Pawn(Figure.getWhitePlayer(), Pawn.getWhitePawnSymbol());
			board[i][6] = pawn;
		}

	}

	public void putBlackPawnsOnBoard() {
		for (int i = 0; i < board.length; i++) {
			Pawn pawn = new Pawn(Figure.getBlackPlayer(), Pawn.getBlackPawnSymbol());
			board[i][1] = pawn;
		}

	}

	public void moveFigure(int currX, int currY, int nextX, int nextY) {
		for (int y = 0; y < BOARD_HEIGHT; y++) {
			for (int x = 0; x < BOARD_WIDTH; x++) {
				if (x == currX && y == currY && board[x][y] != null) {
					Figure figure = board[currX][currY];
					if(figure.isMoveLegal(currX, currY, nextX, nextY)){
						board[nextX][nextY] = figure;
						board[currX][currY] = null;
					}
				}
			}
		}
	}

	public void printBoard() {
		for (int y = 0; y < BOARD_HEIGHT; y++) {
			for (int x = 0; x < BOARD_WIDTH; x++) {
				if(board[x][y] == null){
					System.out.print(" |");
				}else{
					System.out.print(board[x][y].getFigureSymbol() + "|");
				}
			}
			System.out.println();
		}

	}

}
