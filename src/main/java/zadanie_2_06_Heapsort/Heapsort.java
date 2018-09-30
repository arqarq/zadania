package zadanie_2_06_Heapsort;

class Heapsort {
    private int[] heap;
    private int heapSize;

    Heapsort(int[] heap) {
        this.heap = heap;
    }

    void heapSort() {
        buildMaxHeap();
        for (int i = heap.length - 1; i >= 1; i--) {
            int temp = heap[i];
            heap[i] = heap[0];
            heap[0] = temp;
            heapSize--;
            maxHeapify(0);
        }
    }

    private void maxHeapify(int i) {
        int largest;

        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < heapSize && heap[l] > heap[i]) {
            largest = l;
        } else {
            largest = i;
        }
        if (r < heapSize && heap[r] > heap[largest]) {
            largest = r;
        }
        if (largest != i) {
            int temp = heap[largest];
            heap[largest] = heap[i];
            heap[i] = temp;
            maxHeapify(largest);
        }
    }

    private void buildMaxHeap() {
        heapSize = heap.length;
        for (int i = heap.length / 2 - 1; i >= 0; i--) {
            maxHeapify(i);
        }
    }
}