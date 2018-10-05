package zadanie_1_02_IloczynMacierzy;

import java.util.Arrays;

class Arrays_ {
    private static int count;

    static int[][] multiplyArrays(int[][] A, int[][] B) {
        count = 0;
        int[][] W = new int[A.length][B[0].length];
        for (int[] row : W) {
            Arrays.fill(row, 0);
        }

        for (int n = 0; n < W.length; n++) {
            for (int p = 0; p < W[0].length; p++) {
                for (int i = 0; i < B.length; i++) {
                    W[n][p] += A[n][i] * B[i][p];
                    count++;
                    count++;
                }
                count--; //korekta za dodawanie do W[n][p] = 0 na początku
            }
        }
        return W;
    }

    static int getLastCount() {
        return count;
    }
}