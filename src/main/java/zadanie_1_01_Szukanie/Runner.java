package zadanie_1_01_Szukanie;

import static _paczkaPomocnicza.Utility.printArrayOne;
import static zadanie_1_01_Szukanie.Liniowe.searchLinear;

class Runner {
    public static void main(String[] args) {
//        int[] data = {1, 2, 3, 4, 10, 6, 7, 8, 9, 10};
        int[] data = {1, 1, 1, 1, 1, 1, 1, 1, 1, 2};
        int what_to_search = 2;
        System.out.println("Dane wejściowe:");
        printArrayOne(data);

        int[] where = searchLinear(data, what_to_search);
        int i = 0;
        if (where[0] == 0) {
            System.out.println("Nic nie znaleziono.");
        } else {
            while (i < where.length - 1 && where[i] != 0) {
                System.out.println("Znaleziono: " + what_to_search + " na pozycji: " + where[i++] + ".");
            }
        }
        System.out.println("--- ilość porównań: " + where[where.length - 1] + " ---");
    }
}