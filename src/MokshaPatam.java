import java.util.Arrays;

/**
 * Moksha Patam
 * A puzzle created by Zach Blick
 * for Adventures in Algorithms
 * at Menlo School in Atherton, CA
 *
 * Completed by: William Beesley
 *
 */

public class MokshaPatam {

    /**
     * TODO: Complete this function, fewestMoves(), to return the minimum number of moves
     *  to reach the final square on a board with the given size, ladders, and snakes.
     */
    public static int fewestMoves(int boardsize, int[][] ladders, int[][] snakes) {
        int moves = 0;
        int square = 1;
        // sort the list to make the closest ladders first
        Arrays.sort(ladders);
        // while loop so that we keep repeating the code until we get to the end of the board
        while (square <= boardsize) {

        }
        return 0;
    }
}
