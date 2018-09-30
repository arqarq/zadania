package zadanie_2_07_CountingSort;

import java.util.Arrays;

import static _paczkaPomocnicza.Utility.getRandomArrayOne;
import static _paczkaPomocnicza.Utility.printArrayOne;
import static zadanie_2_07_CountingSort.Sort.countingSort;
import static zadanie_2_07_CountingSort.Sort.findK;

class Runner {
    public static void main(String[] args) {
        int[] A = {0, 5, 5, 4, 3, 3, 1, 0, 2, 4, 7};
        int[] B = new int[A.length];
        int[] C;
        int k = findK(A);

        printArrayOne(A);
        C = countingSort(A, B, k);
        printArrayOne(C);                  // albo Arrays.toString()

        int[] AA = getRandomArrayOne(A.length, 10);
        System.out.println(Arrays.toString(AA));
        k = findK(AA);
        printArrayOne(countingSort(AA, B, k));
    }
}