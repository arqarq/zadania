package zadanie_5_01_AlgorytmZachłanny;

import java.util.Arrays;

class RestWithTab {
    private static final int[] nominals = {10, 5, 2, 1};
    private static final int[] amounts = {12, 10, 11, 18};

    private static int greedy(int rest) {
        int c = 0;

        for (int i = 0; i < nominals.length; i++) {
            int count = rest / nominals[i];
            if (count > 0) {
                if (nominals[i] * amounts[i] >= rest) {
                    rest -= count * nominals[i];
                    c += count;
                    amounts[i] -= count;
                } else {
                    rest -= nominals[i] * amounts[i];
                    c += amounts[i];
                    amounts[i] = 0;
                }
            }
        }
        if (rest > 0) {
            throw new IllegalArgumentException("Insufficient funds!");
        } else {
            return c;
        }
    }

    public static void main(String[] args) { // start 51 monet
        RestWithTab rest = new RestWithTab();
        System.out.println(rest);
        System.out.format("Wydano: " + greedy(99) + " monet dla reszty: %s%n", 99);
        System.out.println(rest);
        System.out.println(greedy(1));
        System.out.println(rest);
        System.out.println(greedy(110));
        System.out.println(rest);
        greedy(1000);
    }

    @Override
    public String toString() {
        return Arrays.toString(nominals) + System.lineSeparator() + Arrays.toString(amounts);
    }
}