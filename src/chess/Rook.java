package chess;

public class Rook extends Figure{
	
	
	private static final char BLACK_ROOK_SYMBOL = 'r';
	private static final char WHITE_ROOK_SYMBOL = 'R';
	
	public Rook(char playerColor, char figureSymbol) {
		super(playerColor, figureSymbol);
	}


	public static char getBlackRookSymbol() {
		return BLACK_ROOK_SYMBOL;
	}

	public static char getWhiteRookSymbol() {
		return WHITE_ROOK_SYMBOL;
	}


	@Override
	public boolean isMoveLegal(int currX, int currY, int nextX, int nextY) {
		if(currX == nextX || currY == nextY){
			return true;
		}
		return false;
	}
	
	
}
