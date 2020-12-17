package mason.checkersAi.checkers;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Checkers Board should be an 4x8 byte array with 0 representing no checker, 1
 * representing a white checker, 2 representing a black checker, 3 representing
 * a white queen, and a 4 representing a black queen. Slot [1][1] should
 * represent the coordinate (1,1) in the bottom left, slot [1][2] should
 * represent the coordinate (3,1), slot [2][1] should represent the coordinate
 * (2,2), and so on, with the unoccupied squares omitted from the array.
 * 
 * @author Mason
 *
 */
public class Board {

	protected byte[][] checkers = new byte[4][8];

	public static final byte[][] DEFAULT_BOARD = new byte[][] { { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 },
			{ 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 } };

	/**
	 * True is white's turn and false is black's turn
	 */
	protected boolean turn;

	public Board() {
		turn = true;
		// copies DEFAULT_BOARD to checkers
		checkers = Arrays.stream(DEFAULT_BOARD).map(byte[]::clone).toArray(byte[][]::new);
	}

	public Board(Board board) {
		this.turn = board.turn;
		// copies DEFAULT_BOARD to checkers
		this.checkers = Arrays.stream(board.checkers).map(byte[]::clone).toArray(byte[][]::new);
	}

	/**
	 * 
	 * @param x         The x coordinate of the piece
	 * @param y         The y coordinate of the piece
	 * @param direction The direction of move, 0 is left-front, 1 is right-front, 2
	 *                  is left-back, 3 is right-back
	 */
	public void move(int x, int y, int direction) {

	}

	/**
	 * This returns a list of arrays with each array containing the x coordinate[0],
	 * the y coordinate[1],the direction(0-3)[3]
	 * 
	 * @return
	 */
	public ArrayList<int[]> getMoves() {
		ArrayList<int[]> moves = new ArrayList<int[]>();

		for (int i = 0; i < checkers.length; i++) {
			for (int j = 0; j < checkers[i].length; j++) {
				byte c = checkers[i][j];
				if (c != 0) {
					//if the checker can move to the positions
					boolean lf = turn, rf = turn, lb = !turn, rb = !turn;
					lf = lf && (!(i % 2 == 0 && j == 1) && ());
					rf = rf && ();
					lb = lb && ();
					rb = rb && ();
					if (c == 1) {

					} else if (c == 2) {

					} else if (c == 3) {

					} else if (c == 4) {

					}
				}
			}
		}

		return moves;
	}

}
