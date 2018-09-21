package zadanieCountingSort;

import static _paczkaPomocnicza.Utility.printArrayOne;
import static zadanieCountingSort.Sort.countingSort;
import static zadanieCountingSort.Sort.findK;

class Runner {
    public static void main(String[] args) {
        int[] A = {0, 5, 5, 4, 3, 3, 1, 0, 2, 4};
        int[] B = new int[A.length];
        int[] C;
        int k = findK(A);

        printArrayOne(A);
        C = countingSort(A, B, k);
        printArrayOne(C);                  // albo Array.toString()
    }
}