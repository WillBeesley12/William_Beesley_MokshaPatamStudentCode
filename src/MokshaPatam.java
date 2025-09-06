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
            chutes_ladders.put(snakes[i][0], snakes[i][1]);
        }
        // first I need to make the graph
        Map<Integer, ArrayList<Integer>> graph = new HashMap<>();
        // now we add the edges by going through each point
        for (int i = 1; i < boardsize; i++) {
            if (chutes_ladders.containsKey(i)) {
                continue;
            }
            // add the vertex first
            graph.putIfAbsent(i, new ArrayList<>());
            // now go through the next 6 squares and add them to the graph
            // but need to use the variable max to make sure we don't go past the end of the board
            int max = boardsize + 1 - i;
            max = Math.min(max, 7);
            for (int j = 1; j < max; j++) {
                // check if any of the squares are chutes or ladders
                int num = i + j;
                if (chutes_ladders.containsKey(num)) {
                    // if they are, replace the original square with the ending square
                    num = chutes_ladders.get(num);
                }
                // now we add the resulting square to the graph
                graph.putIfAbsent(num, new ArrayList<>());
                if (!graph.get(i).contains(num)) {
                    graph.get(i).add(num);
                }
            }
        }
        System.out.println(graph);
        return 0;
    }
    public static void main(String[] args) {
        int boardsize = 10;
        int[][] ladders = {{3,8}};
        int[][] snakes = {{7,2}};
        fewestMoves(boardsize, ladders, snakes);
    }
}
