package zadanie_4_05_Graf;

import java.util.Arrays;

class Runner {
    public static void main(String[] args) {
        Graph graph = new Graph();
        System.out.println(graph);
        int i = 3;
        System.out.println("Sąsiedzi wierzchołka (" + i + "): " + Arrays.toString(graph.getNeighbours(i)));
        i = 0;
        System.out.println("Sąsiedzi wierzchołka (" + i + "): " + Arrays.toString(graph.getNeighbours(i)));

        graph.dfs(0);
        graph.dfs(3);
        graph.bfs(3);
    }
}