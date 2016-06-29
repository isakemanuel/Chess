package chessModel;

public abstract class ComputerPlayer extends Player{
	Board board;

	public ComputerPlayer(Board b, String n, int s){
		super(n, s);
		board = b;
		side = s;
	}

	/**
	 * The move the game waits for.
	 * 
	 * @return Array of two numbers, coordinates of move (fromX, fromY, toX,
	 *         toY)
	 */
	public abstract Integer[] getMove();
}