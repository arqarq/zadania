package zadanie_1_01_Szukanie;

class Binary {
    /**
     * Wyszukiwanie binarne
     *
     * @param data wejściowa tablica liczb (rosnąca!);
     * @param what_to_search szukany element
     * @return data[0] - pozycja, pod którą występuje szukany element lub -1, jeśli elementu nie ma;<br/>
     *         data[1] - ilość porównań
     */
    static int[] searchBinary(int[] data, int what_to_search) {
        int left = 0;
        int right = data.length - 1;
        int m = (left + right) / 2;
        data[1] = 0;

        while (left <= right) {
            data[1]++;
            if (data[m] == what_to_search) {
                data[0] = m + 1;
                return data;
            }
            if (data[m] > what_to_search) {
                right = m - 1;
                m = (left + right) / 2;
            } else {
                left = m + 1;
                m = (left + right) / 2;
            }
        }
        data[0] = -1;
        return data;
    }
}