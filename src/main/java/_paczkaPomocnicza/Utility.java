package _paczkaPomocnicza;

import java.util.Random;

public class Utility {
    public static int[][] getRandomArray() {
        return new int[1][1];
    }

    public static int[] getRandomArrayOne(int ile, int zakres){
        Random random = new Random();
        int[] array = new int[ile];
        for(int i = 0; i < ile; i++){
            array[i] = random.nextInt(zakres);
        }
        return array;
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void printArrayOne(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}