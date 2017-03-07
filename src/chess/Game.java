package chess;

import java.util.Scanner;

public class Game {

	private static boolean isRunning = true;
	private static Board board = new Board();
	private static String command;

	public static void main(String[] args) {

		runGame();

	}

	private static void runGame() {
		while (isRunning) {
			getCommandFromPlayer();
			ExecutePlayerCommand();
			board.printBoard();
		}

	}


	private static void ExecutePlayerCommand() {
		String commands[] = command.split(" ");
		board.moveFigure(Integer.parseInt(commands[0]), Integer.parseInt(commands[1]), Integer.parseInt(commands[2]),
				Integer.parseInt(commands[3]));
	}

	private static void getCommandFromPlayer() {
			Scanner input = new Scanner(System.in);
			command = input.nextLine();
	}

}
