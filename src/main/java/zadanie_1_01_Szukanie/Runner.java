package zadanie_1_01_Szukanie;

import java.util.Arrays;

import static _paczkaPomocnicza.Utility.getRandomArrayOne;
import static _paczkaPomocnicza.Utility.printArrayOne;
import static zadanie_1_01_Szukanie.Binary.searchBinary;
import static zadanie_1_01_Szukanie.Liniowe.searchLinear;

class Runner {
    public static void main(String[] args) {
//        int[] data = {1, 2, 3, 4, 10, 6, 7, 8, 9, 10};
//        int[] data = {1, 1, 1, 1, 1, 1, 1, 1, 1, 2};
        int[] data = getRandomArrayOne(1000, 600);
        int what_to_search = 551;
        Arrays.sort(data);
        System.out.println("Dane wejściowe:");
        printArrayOne(data);

        int[] where = searchLinear(data, what_to_search);
        int i = 0;
        if (where[0] == 0) {
            System.out.println("Nie znaleziono: " + what_to_search);
        } else {
            while (i < where.length - 1 && where[i] != 0) {
                System.out.println("Znaleziono: " + what_to_search + " na pozycji: " + where[i++] + ".");
            }
        }
        System.out.println("--- ilość porównań: " + where[where.length - 1] + " ---");

        where = searchBinary(data, what_to_search);
        if (where[0] == -1) {
            System.out.println("Nie znaleziono: " + what_to_search);
        } else {
            System.out.println("Znaleziono: " + what_to_search + " na pozycji: " + where[0] + ".");
        }
        System.out.println("--- ilość porównań: " + where[1] + " ---");
    }
}