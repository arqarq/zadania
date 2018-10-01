package zadanie_5_01_AlgorytmZachłanny;

import java.util.LinkedHashMap;
import java.util.Map;

class RestWithMap {
    private final Map<Integer, Integer> stan = new LinkedHashMap<>();

    private RestWithMap() {
        stan.put(10, 18);
        stan.put(5, 22);
        stan.put(2, 13);
        stan.put(1, 15);
    }

    public static void main(String[] args) {
        RestWithMap rest = new RestWithMap();
        System.out.println(rest.stan);
        System.out.println(rest.greedy(99));
        System.out.println(rest.stan);
        System.out.println(rest.greedy(1));
        System.out.println(rest.stan);
        System.out.println(rest.greedy(1000));
    }

    private int greedy(int rest) {
//        int temp = rest;
//        int wyn;
//        int coin = 0;
//
//        while (temp != 0) {
//            for (Map.Entry<Integer, Integer> e : stan.entrySet()) {
//                wyn = temp % e.getKey();
//                e.setValue(e.getValue() - temp / e.getKey());
//                coin = coin + temp / e.getKey();
//                temp = wyn;
//            }
//        }
//        return coin;
        int count = 0;
        for (Map.Entry<Integer, Integer> e : stan.entrySet()) {
            int coinsAmount = rest / e.getKey();
            if (e.getValue() >= coinsAmount) {
                rest -= coinsAmount * e.getKey();
                count += coinsAmount;
            } else {
                rest -= e.getValue() * e.getKey();
                count += e.getValue();
            }
            e.setValue(e.getValue() - coinsAmount); // zmniejszenie ilości monet w skarbcu
        }
        if (rest > 0) {
            throw new IllegalArgumentException("Insufficient funds!");
        }
        return count;
    }
}