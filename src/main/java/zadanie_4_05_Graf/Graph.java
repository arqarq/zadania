package zadanie_4_05_Graf;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.stream.IntStream;

import static _paczkaPomocnicza.Utility.printArray;

class Graph {
    private static final int[][] ARRAYADJ = {
            {0, 1, 1, 1, 0, 0, 0, 0},
            {1, 0, 0, 0, 1, 0, 0, 0},
            {1, 0, 0, 0, 0, 1, 0, 0},
            {1, 0, 0, 0, 0, 0, 1, 0},
            {0, 1, 0, 0, 0, 0, 0, 1},
            {0, 0, 1, 0, 0, 0, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 1},
            {0, 0, 0, 0, 1, 1, 1, 0}
    };

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

    private void visit(boolean[] arrayVisit, int v) {
        arrayVisit[v] = true;
        System.out.print(v + " ");
    }

    void dfs(int start) {
        boolean[] arrayVisit = new boolean[ARRAYADJ.length];
        IntStack stack = new IntStack(5);
        int[] n;

        System.out.print("DFS dla wierzchołka (" + start + "): ");
        stack.push(start);
        visit(arrayVisit, start);
        while (!stack.isEmpty()) {
//            n = getNeighbours(stack.pop());
            for (int v : getNeighbours(stack.pop())) {
                if (!arrayVisit[v]) {
                    stack.push(v);
                    visit(arrayVisit, v);
                }
            }
/*
            for (int i = 0; i < n.length; i++) {
                if (!arrayVisit[n[i]]) {
                    stack.push(n[i]);
                    visit(arrayVisit, n[i]);
                }
            }
*/
        }
        System.out.println();
    }

    void bfs(int start) {
        boolean[] arrayVisit = new boolean[ARRAYADJ.length];
        Queue<Integer> queue = new ArrayDeque<>();
//        IntStack stack = new IntStack(5);
        int[] n;

        System.out.print("BFS dla wierzchołka (" + start + "): ");
        queue.add(start);
        visit(arrayVisit, start);
        while (!queue.isEmpty()) {
//            n = getNeighbours(stack.pop());
            for (int v : getNeighbours(queue.remove())) {
                if (!arrayVisit[v]) {
                    queue.add(v);
                    visit(arrayVisit, v);
                }
            }
        }
        System.out.println();
    }

    @Override
    public String toString() {
        System.out.println("Macierz grafu:");
        printArray(ARRAYADJ);
        return ""; // linia wyżej jak?
    }
}