package chess;

public class Horse extends Figure{
	
	
	private static final char BLACK_HORSE_SYMBOL = 'h';
	private static final char WHITE_HORSE_SYMBOL = 'H';
	
	public Horse(char playerColor, char figureSymbol) {
		super(playerColor, figureSymbol);
	}


	public static char getBlackHorseSymbol() {
		return BLACK_HORSE_SYMBOL;
	}

	public static char getWhiteHorseSymbol() {
		return WHITE_HORSE_SYMBOL;
	}


	@Override
	public boolean isMoveLegal(int currX, int currY, int nextX, int nextY) {
		if(){
			return true;
		}
		return false;
	}
	
	
}
