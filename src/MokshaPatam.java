import java.util.*;
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
        // I will also make a dictionary for the chutes and ladders to make it easier to index later
        Map<Integer, Integer> chutes_ladders = new HashMap<>();
        for (int i = 0; i < ladders.length; i++) {
            chutes_ladders.put(ladders[i][0], ladders[i][1]);
        }
        for (int i = 0; i < snakes.length; i++) {
            chutes_ladders.put(snakes[i][0], ladders[i][1]);
        }
        // first I need to make the graph
        Map<Integer, ArrayList<Integer>> graph = new HashMap<>();
        // now we add the edges by going through each point
        for (int i = 0; i < boardsize; i++) {
            // add the vertex first
            graph.putIfAbsent(i, new ArrayList<>());
            // now go through the next 6 squares and add them to the graph;
            for (int j = 0; j < 6; j++) {
                // check if any of the squares are chutes or ladders

                // if not we can just add them directly to the graph
            }
        }
        return 0;
    }
}
