package zadanie_4_05_Graf;

import java.util.Arrays;

class Runner {
    public static void main(String[] args) {
        Graph graph = new Graph();
//        System.out.println(graph.getNeighbours(3));
        System.out.println(Arrays.toString(graph.getNeighbours(3)));
    }

    void dfsPrint(int[][] graph, int start) {
        IntStack stack = new IntStack(10);
        int[] arrayVisit = new int[graph.length];
    }
}