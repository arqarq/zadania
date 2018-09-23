package zadanie_1_01_Szukanie;

class Liniowe {
    static int[] searchLinear(int[] data, int what_to_search) {                     //zwraca tablicę wyników szukania
        int[] where = new int[data.length];
        for (int i = 0; i < where.length; i++) {                                    //elegancka inicjacja
            where[i] = 0;
        }

        int j = 0;
        for (int i = 0; i < data.length; i++) {
            if (what_to_search == data[i]) {
                where[j++] = i + 1;
            }
        }
        return where;
    }
}