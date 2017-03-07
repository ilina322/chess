package chess;

public class King extends Figure{
	
	
	private static final char BLACK_KING_SYMBOL = 'k';
	private static final char WHITE_KING_SYMBOL = 'K';
	
	public King(char playerColor, char figureSymbol) {
		super(playerColor, figureSymbol);
	}


	public static char getBlackKingSymbol() {
		return BLACK_KING_SYMBOL;
	}

	public static char getWhiteKingSymbol() {
		return WHITE_KING_SYMBOL;
	}


	@Override
	public boolean isMoveLegal(int currX, int currY, int nextX, int nextY) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
