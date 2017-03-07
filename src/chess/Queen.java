package chess;

public class Queen extends Figure{
	
	
	private static final char BLACK_QUEEN_SYMBOL = 'q';
	private static final char WHITE_QUEEN_SYMBOL = 'Q';
	
	public Queen(char playerColor, char figureSymbol) {
		super(playerColor, figureSymbol);
	}


	public static char getBlackQueenSymbol() {
		return BLACK_QUEEN_SYMBOL;
	}

	public static char getWhiteQueenSymbol() {
		return WHITE_QUEEN_SYMBOL;
	}


	@Override
	public boolean isMoveLegal(int currX, int currY, int nextX, int nextY) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
