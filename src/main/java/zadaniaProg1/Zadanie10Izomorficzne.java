package zadaniaProg1;

import java.util.HashMap;
import java.util.Map;

class Zadanie10Izomorficzne {
    private static boolean isIzomorf(String str1, String str2) {
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

    public static void main(String[] args) {
        String str1 = "egggu";
        String str2 = "adddt";

        System.out.println(str1);
        System.out.println(str2);
        if (isIzomorf(str1, str2)) {
            System.out.println("Są izomorficzne.");
        } else {
            System.out.println("Nie są izomorficzne.");
        }
    }
}