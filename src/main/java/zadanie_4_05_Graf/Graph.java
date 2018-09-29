package zadanie_4_05_Graf;

import java.util.stream.IntStream;

class Graph {
    private static final int[][] ARRAYADJ = {{0, 1, 1, 0, 0},
            {1, 0, 0, 1, 0},
            {1, 0, 0, 1, 0},
            {0, 1, 1, 0, 1},
            {0, 0, 0, 1, 0}};

    int[] getNeighbours(int v) {
//        List<Integer> neighbours = new LinkedList<>();
//        for (int i = 0; i < ARRAYADJ.length; i++){
//            if (ARRAYADJ[v][i] == 1){
//                neighbours.add(i);
//            }
//        }
//        return neighbours;
        return IntStream.range(0, ARRAYADJ.length)
                .filter(i -> ARRAYADJ[v][i] == 1)
                .toArray();
    }
}