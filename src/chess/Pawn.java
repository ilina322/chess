package chess;

public class Pawn extends Figure{
	
	
	private static final char BLACK_PAWN_SYMBOL = 'p';
	private static final char WHITE_PAWN_SYMBOL = 'P';
	
	public Pawn(char playerColor, char figureSymbol) {
		super(playerColor, figureSymbol);
	}
	
	@Override
	public boolean isMoveLegal(int currX, int currY, int nextX, int nextY){
		if (getPlayerColor() == getBlackPlayer()) {
			if (currX == nextX && currY + 1 == nextY) {
				return true;
			}
		}
		
		if (getPlayerColor() == getWhitePlayer()) {
			if (currX == nextX && currY - 1 == nextY) {
				return true;
			}
		}
		return false;
	}

	public static char getBlackPawnSymbol() {
		return BLACK_PAWN_SYMBOL;
	}

	public static char getWhitePawnSymbol() {
		return WHITE_PAWN_SYMBOL;
	}
	
	
}
