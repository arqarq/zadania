package _rozwiązania;

import java.util.Random;

public class Exercise4 {
    /**
     * Metoda zwraca dwuwymiarową tablicę wypełnioną losowymi liczbami
     *
     * @param r - ilość wierszy
     * @param c - ilość kolumn
     * @return - dwuwymiarowa tablica wypełniona losowymi liczbami
     */
    private static int[][] getRandomArray(int r, int c) {
        Random random = new Random();
        int[][] array = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                array[i][j] = random.nextInt(1000);
            }
        }
        return array;
    }

    /**
     * Metoda wypisuje na ekran zawartość wejściowej tablicy
     *
     * @param array - wejściowa tablica
     */
    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * Metoda sprawdza, w którym wierszu największa wartość jest najmniejsza
     *
     * @param array - tablica wejściowa
     * @return - indeks wiersza, w którym wierszu największa wartość jest najmniejsza
     */
    private static int getRowWithMinMaxValue(int[][] array) {
        int min = Integer.MAX_VALUE;
        int x = -1;
        for (int i = 0; i < array.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            if (max < min) {
                min = max;
                x = i;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int[][] array = getRandomArray(5, 4);
        printArray(array);
        System.out.println("Row with min max value: " + getRowWithMinMaxValue(array));
    }
}