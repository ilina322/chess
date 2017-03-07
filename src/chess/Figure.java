package chess;

public abstract class Figure {

	private static final char BLACK_PLAYER = 'b';
	private static final char WHITE_PLAYER = 'w';
	private int currX;
	private int currY;
	private int nextX;
	private int nextY;
	private char playerColor;
	private char figureSymbol;
	
	public Figure(char playerColor, char figureSymbol) {
		this.playerColor = playerColor;
		this.figureSymbol = figureSymbol;
	}
	
	public int getCurrX() {
		return currX;
	}
	
	public int getCurrY() {
		return currY;
	}
	public int getNextX() {
		return nextX;
	}
	
	public int getNextY() {
		return nextY;
	}
	
	public char getPlayerColor() {
		return playerColor;
	}
	
	public void setNextX(int nextX) {
		this.nextX = nextX;
	}
	
	public void setNextY(int nextY) {
		this.nextY = nextY;
	}

	public static char getBlackPlayer() {
		return BLACK_PLAYER;
	}

	public static char getWhitePlayer() {
		return WHITE_PLAYER;
	}

	public char getFigureSymbol() {
		return figureSymbol;
	}
	
	public abstract boolean  isMoveLegal(int currX, int currY, int nextX, int nextY);
	
	
	
}
