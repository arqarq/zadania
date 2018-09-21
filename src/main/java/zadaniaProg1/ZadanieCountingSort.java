package zadaniaProg1;

class ZadanieCountingSort {
    private static int[] CountingSort(int[] A, int[] B, int k) {
        int[] C = new int[k];
        for (int i = 0; i <= k - 1; i++) {
            C[i] = 0;
        }
        for (int i = 0; i <= A.length - 1; i++) {
            C[A[i]]++;
        }
        for (int i = 1; i <= k - 1; i++) {
            C[i] = C[i] + C[i - 1];
        }
        for (int i = 0; i <= A.length - 1; i++) {
            B[C[A[i]] - 1] = A[i];
            C[A[i]]--;
        }
        return B;
    }

    private static int findK(int[] in) {
        int intmax = Integer.MIN_VALUE;
        for (int i = 0; i < in.length; i++) {
            intmax = Integer.max(intmax, in[i]);
        }
        return ++intmax;
    }

    public static void main(String[] args) {
        int[] A = {0, 5, 5, 4, 3, 3, 1, 0, 2, 4};
        int[] B = new int[A.length];
        int k = findK(A);

        Utility.printArrayOne(A);
        B = CountingSort(A, B, k);
        Utility.printArrayOne(B);                  // albo Array.toString()
    }
}