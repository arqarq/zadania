package zadanie_2_06_Heapsort;

import java.util.Arrays;

class Runner {
    public static void main(String[] args) {
        int[] i = {15, 1, 18, 98, 56, 100, 23};
        Heapsort heap = new Heapsort(i);

        System.out.println(Arrays.toString(i));
        heap.heapSort();
        System.out.println(Arrays.toString(i));
    }
}