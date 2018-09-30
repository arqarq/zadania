package _paczkaPomocnicza;

import java.util.Random;

public class Utility {
    public static int[][] getRandomArray() {
        return new int[1][1];
    }

    public static int[] getRandomArrayOne(int ile, int zakres) {
        Random random = new Random();
        int[] array = new int[ile];
        for (int i = 0; i < ile; i++) {
            array[i] = random.nextInt(zakres);
        }
        return array;
    }

    public static void printArray(int[][] array) {
//        for (int[] i : array) {
        for (int i = 0; i < array.length; i++) {
            for (int j : array[i]) {
//            for (int j = 0; j < i.length; j++) {
                System.out.print(j + "\t");
            }
            if (i == array.length - 1) {
                System.out.print("");
            } else {
                System.out.println();
            }
        }
    }

    public static void printArrayOne(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}