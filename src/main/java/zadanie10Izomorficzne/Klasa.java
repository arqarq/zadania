package zadanie10Izomorficzne;

import java.util.HashMap;
import java.util.Map;

class Klasa {
    static boolean isIzomorf(String str1, String str2) {
        char[] tabChar1 = str1.toCharArray();
        char[] tabChar2 = str2.toCharArray();
        Map<Character, Character> mapa = new HashMap<>();

        if (str1.length() == str2.length()) {
            int dlugo = str1.length();
            for (int i = 0; i < dlugo; i++) {
                if (mapa.containsKey(tabChar1[i]) && mapa.get(tabChar1[i]) != tabChar2[i]) {
                    return false;
                }
                mapa.put(tabChar1[i], tabChar2[i]);
            }
        } else {
            return false;
        }
        return true;
    }
}