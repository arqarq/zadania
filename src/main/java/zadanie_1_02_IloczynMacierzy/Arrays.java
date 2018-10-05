package zadanie_1_02_IloczynMacierzy;

class Arrays {
    private static int count;

    static int[][] multiplyArrays(int[][] A, int[][] B) {
        count = 0;
        int[][] W = new int[A.length][B[0].length];
//        for (int[] row : W){
//            superArrays).fill(row, 0);}
        for (int n = 0; n < W.length; n++) {
            for (int p = 0; p < W[0].length; p++) {
                for (int i = 0; i < A[0].length; i++) {
                    W[n][p] += A[0][i] * B[i][0];
                    count++;
                }
            }
        }
        return W;
    }

    static int getLastCount() {
        return count;
    }
}