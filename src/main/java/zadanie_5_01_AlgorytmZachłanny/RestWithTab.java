package zadanie_5_01_AlgorytmZachłanny;

class RestWithTab {
    private static int greedy(int rest) {
        int[] nominals = {10, 5, 2, 1};
        int[] amounts = {12, 10, 11, 18};
        int c = 0;

        for (int i = 0; i < nominals.length; i++) {
            int count = rest / nominals[i];
            if (count > 0) {
                if (nominals[i] * amounts[i] >= rest) {
                    rest -= count * nominals[i];
                    c += count;
                } else {
                    rest -= nominals[i] * amounts[i];
                    c += amounts[i];
                }
            }
        }
        if (rest > 0) {
            throw new IllegalArgumentException("Insufficient funds!");
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        System.out.println(greedy(99));
        System.out.println(greedy(100));
        System.out.println(greedy(101));
        System.out.println(greedy(210)); // max 51 monet
        System.out.println(greedy(211));
    }
}