package _rozwiązania;

import java.util.Arrays;
import java.util.Random;

class Hard2 {
    /**
     * Metoda znajduje maksymalny element w podanej tablicy metodą "dziel i zwyciężaj".
     * Złożoność: O(N). Nie jest to złożoność logarytmiczna, co może sugerować tworzenie drzewa z dzielonych
     * części tablicy, ponieważ i tak musimy przeanalizować każdy element czy nie jest on największy.
     *
     * @param array analizowana tablica
     * @param l     lewa granica podziału
     * @param r     prawa granica podziału
     * @return maksymalny element w podanej tablicy
     */
    private static int findMaxDivideAndConquer(int[] array, int l, int r) {
        if (l == r) { //mamy 1 element - jest on elementem maksymalnym
            return array[l];
        }
        //mamy więcej niż 1 element
        int m = (l + r) / 2; //środek
        int maxLeft = findMaxDivideAndConquer(array, l, m); //max z lewej połowy
        int maxRight = findMaxDivideAndConquer(array, m + 1, r); //max z prawej połowy
        return Math.max(maxLeft, maxRight); //zwracamy max z lewej i prawej połowy
    }

    /**
     * Metoda znajduje maksymalny element w podanej tablicy prostą metodą liniowego przeszukiwania.
     * Złożoność: O(N)
     *
     * @param array analizowana tablica
     * @return maksymalny element w podanej tablicy
     */
    private static int findMaxSimple(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    /**
     * Metoda tworzy tablicę losowych liczb z zadanego przedziału
     *
     * @param n     rozmiar tablicy
     * @param bound zakres losowania liczb
     * @return tablica losowych liczb
     */
    private static int[] getRandomArray(int n, int bound) {
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(bound);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = getRandomArray(4, 20);
        System.out.println("Tablica: " + Arrays.toString(array));
        System.out.println("[Przeszukiwanie liniowe] Element maksymalny: " + findMaxSimple(array));
        System.out.println("[Przeszukiwanie \"dziel i zwyciężaj\"] Element maksymalny: "
                + findMaxDivideAndConquer(array, 0, array.length - 1));
    }
}