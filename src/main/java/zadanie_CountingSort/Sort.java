package zadanie_CountingSort;

class Sort {
    static int[] countingSort(int[] A, int[] B, int k) {
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

    static int findK(int[] in) {
        int intmax = Integer.MIN_VALUE;
        for (int anIn : in) {
            intmax = Integer.max(intmax, anIn);
        }
        return ++intmax;
    }
}