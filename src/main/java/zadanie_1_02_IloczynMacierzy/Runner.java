package zadanie_1_02_IloczynMacierzy;

import static _paczkaPomocnicza.Utility.getRandomArray;
import static _paczkaPomocnicza.Utility.printArrayWithName;

class Runner {
    public static void main(String[] args) {
        int[][] macierz1 = getRandomArray(5, 6, 10);
        int[][] macierz2 = getRandomArray(6, 5, 10);
        printArrayWithName(macierz1, "Macierz 1");
        printArrayWithName(macierz2, "Macierz 2");
    }
}