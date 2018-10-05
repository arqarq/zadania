package zadanie_1_02_IloczynMacierzy;

import static _paczkaPomocnicza.Utility.getRandomArray;
import static _paczkaPomocnicza.Utility.printArrayWithName;
import static zadanie_1_02_IloczynMacierzy.Arrays_.getLastCount;
import static zadanie_1_02_IloczynMacierzy.Arrays_.multiplyArrays;

class Runner {
    public static void main(String[] args) {
        int[][] macierz1 = getRandomArray(4, 2, 10);
        int[][] macierz2 = getRandomArray(2, 3, 10);
        printArrayWithName(macierz1, "Macierz 1");
        printArrayWithName(macierz2, "Macierz 2");
        printArrayWithName(multiplyArrays(macierz1, macierz2), "Wynik");
        System.out.println("Ilość operacji mnożenia: " + getLastCount());
    }
}