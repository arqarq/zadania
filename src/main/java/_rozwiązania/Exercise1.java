package _rozwiązania;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {

    /**
     * Wyszukiwanie liniowe
     *
     * @param array - wejściowa tablica liczb
     * @param x     - szukany element
     * @return - indeks, pod którym występuje szukany element lub -1, jeśli elementu nie ma
     */
    private static int linearSearch(int[] array, int x) {
        int compareCount = 0;
        for (int i = 0; i < array.length; i++) {
            compareCount++;
            if (array[i] == x) {
                System.out.println("Compare count: " + compareCount);
                return i;
            }
        }
        System.out.println("Compare count: " + compareCount);
        return -1;
    }

    /**
     * Wyszukiwanie binarne
     *
     * @param array - wejściowa tablica liczb
     * @param x     - szukany element
     * @return - indeks, pod którym występuje szukany element lub -1, jeśli elementu nie ma
     */
    private static int binarySearch(int[] array, int x) {
        int compareCount = 0;
        int left = 0;
        int right = array.length - 1;
        int middle = (left + right) / 2;
        while (left <= right) {
            compareCount++;
            if (array[middle] == x) {
                System.out.println("Compare count: " + compareCount);
                return middle;
            }
            if (array[middle] > x) {
                right = middle - 1;
                middle = (left + right) / 2;
            } else {
                left = middle + 1;
                middle = (left + right) / 2;
            }
        }
        System.out.println("Compare count: " + compareCount);
        return -1;
    }

    public static void main(String[] args) {
//        int[] array = {1, 5, 10, 17, 19, 28, 90, 110, 150};
        int[] array = new int[100];
//        Random random = new Random();
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(100);
//        }
//        Arrays.sort(array);
        int x = 59;

//        System.out.println("Linear search: " + linearSearch(array, x));
//        System.out.println("Binary search: " + binarySearch(array, x));

        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < 150; i++) {
            a.add(i);
        }
        Collections.shuffle(a);
//        List<Integer> b = a.subList(0, 100);
        for (int i = 0; i < 100; i++) {
            array[i] = a.get(i);
        }
        Arrays.sort(array); // array posortowana i bez dubli!
//        int d = a.get(0);
//        List b = a.subList(0, 4);
//        a = a[0];
        System.out.println("Linear search: " + linearSearch(array, x));
        System.out.println("Binary search: " + binarySearch(array, x));
    }
}