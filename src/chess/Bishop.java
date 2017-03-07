package chess;

public class Bishop extends Figure {

	private static final char BLACK_BISHOP_SYMBOL = 'b';
	private static final char WHITE_BISHOP_SYMBOL = 'B';

	public Bishop(char playerColor, char figureSymbol) {
		super(playerColor, figureSymbol);
	}

	public static char getBlackBishopSymbol() {
		return BLACK_BISHOP_SYMBOL;
	}

	public static char getWhiteBishopSymbol() {
		return WHITE_BISHOP_SYMBOL;
	}

	@Override
	public boolean isMoveLegal(int currX, int currY, int nextX, int nextY) {
		if (getPlayerColor() == getBlackPlayer()) {
			if (Math.abs(currX - nextX) == Math.abs(currY - nextY)) {
				return true;
			}
		}
		return false;
	}

}